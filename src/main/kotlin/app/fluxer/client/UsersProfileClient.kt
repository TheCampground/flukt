package app.fluxer.client

import app.fluxer.models.UserProfileFullResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`get`
import io.ktor.client.request.`header`
import io.ktor.client.request.headers
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.String
import kotlinx.coroutines.CancellationException

public class UsersProfileClient(
  private val httpClient: HttpClient,
) {
  /**
   * Get user profile
   * Retrieves detailed profile information for a user, including bio, custom status, and badges.
   * Optionally includes mutual friends and mutual guilds if requested. May respect privacy settings.
   *
   * Parameters:
   * 	 @param targetId The target id
   * 	 @param guildId 
   * 	 @param withMutualFriends 
   * 	 @param withMutualGuilds 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.UserProfileFullResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun getUserProfile(
    targetId: String,
    guildId: String? = null,
    withMutualFriends: String? = null,
    withMutualGuilds: String? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<UserProfileFullResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/users/${targetId}/profile""")
      val params = buildList {
        guildId?.let { add("guild_id=${it}") }
        withMutualFriends?.let { add("with_mutual_friends=${it}") }
        withMutualGuilds?.let { add("with_mutual_guilds=${it}") }
      }
      if (params.isNotEmpty()) append("?").append(params.joinToString("&"))
    }

    return try {
      val response = httpClient.`get`(url) {
        `header`("Accept", "application/json")
        headers {
          apiConfiguration.customHeaders.forEach { (name, value) ->
            remove(name)
            append(name, value)
          }
        }
      }

      if (response.status.isSuccess()) {
        NetworkResult.Success(response.body())
      } else {
        val errorBody = response.bodyAsText().ifBlank { null }
        NetworkResult.Failure(NetworkError.Http(statusCode = response.status.value,
            statusDescription = response.status.description, body = errorBody))
      }
    } catch (e: ResponseException) {
      val status = e.response.status
      val body = runCatching { e.response.bodyAsText() }.getOrNull()?.ifBlank { null }
      NetworkResult.Failure(NetworkError.Http(status.value, status.description, body))
    } catch (e: IOException) {
      NetworkResult.Failure(NetworkError.Network(e))
    } catch (e: ContentConvertException) {
      NetworkResult.Failure(NetworkError.Serialization(e))
    } catch (e: NoTransformationFoundException) {
      NetworkResult.Failure(NetworkError.Serialization(e))
    } catch (e: CancellationException) {
      throw e
    } catch (e: Exception) {
      NetworkResult.Failure(NetworkError.Unknown(e))
    }
  }
}
