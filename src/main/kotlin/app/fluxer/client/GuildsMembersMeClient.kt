package app.fluxer.client

import app.fluxer.models.GuildMemberResponse
import app.fluxer.models.MyGuildMemberUpdateRequest
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`get`
import io.ktor.client.request.`header`
import io.ktor.client.request.headers
import io.ktor.client.request.patch
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.String
import kotlinx.coroutines.CancellationException

public class GuildsMembersMeClient(
  private val httpClient: HttpClient,
) {
  /**
   * Get current user guild member
   * Get current user guild member. Returns the member information for the authenticated user in the
   * specified guild.
   *
   * Parameters:
   * 	 @param guildId The ID of the guild
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.GuildMemberResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun getCurrentGuildMember(guildId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<GuildMemberResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/guilds/${guildId}/members/@me"""

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

  /**
   * Update current user guild member
   * Update current user guild member. User can modify their own nickname within the guild.
   *
   * Parameters:
   * 	 @param myGuildMemberUpdateRequest 
   * 	 @param guildId The ID of the guild
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.GuildMemberResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun updateCurrentGuildMember(
    myGuildMemberUpdateRequest: MyGuildMemberUpdateRequest,
    guildId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<GuildMemberResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/guilds/${guildId}/members/@me"""

    return try {
      val response = httpClient.patch(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(myGuildMemberUpdateRequest)
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
