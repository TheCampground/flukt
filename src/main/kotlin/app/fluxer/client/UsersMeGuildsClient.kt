package app.fluxer.client

import app.fluxer.models.GuildResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`get`
import io.ktor.client.request.`header`
import io.ktor.client.request.delete
import io.ktor.client.request.headers
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.coroutines.CancellationException

public class UsersMeGuildsClient(
  private val httpClient: HttpClient,
) {
  /**
   * List current user guilds
   * Requires guilds OAuth scope if using bearer token. Returns all guilds the user is a member of.
   *
   * Parameters:
   * 	 @param before 
   * 	 @param after 
   * 	 @param limit 
   * 	 @param withCounts 
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.collections.List<app.fluxer.models.GuildResponse>] if the
   * request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listGuilds(
    before: String? = null,
    after: String? = null,
    limit: Int? = null,
    withCounts: String? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<List<GuildResponse>> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/users/@me/guilds""")
      val params = buildList {
        before?.let { add("before=${it}") }
        after?.let { add("after=${it}") }
        limit?.let { add("limit=${it}") }
        withCounts?.let { add("with_counts=${it}") }
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

  /**
   * Leave guild
   * Removes the current user from the specified guild membership.
   *
   * Parameters:
   * 	 @param guildId The ID of the guild
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.Unit] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun leaveGuild(guildId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<Unit> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/guilds/${guildId}"""

    return try {
      val response = httpClient.delete(url) {
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
