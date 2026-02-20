package app.fluxer.client

import app.fluxer.models.PackInviteCreateRequest
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`get`
import io.ktor.client.request.`header`
import io.ktor.client.request.headers
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.Any
import kotlin.String
import kotlin.collections.List
import kotlinx.coroutines.CancellationException

public class PacksInvitesClient(
  private val httpClient: HttpClient,
) {
  /**
   * List pack invites
   * Retrieves all currently active invites for the specified pack, including invite codes,
   * creators, expiration times, and usage statistics. The authenticated user must have permission to
   * manage invites for the pack and must be a default (non-bot) user. Returns an array of invite
   * metadata objects.
   *
   * Parameters:
   * 	 @param packId The ID of the pack
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.collections.List<kotlin.Any>] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listPackInvites(packId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<List<Any>> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/packs/${packId}/invites"""

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
   * Create pack invite
   * Creates a new invite for the specified pack with optional parameters such as maximum age and
   * maximum uses. The authenticated user must have permission to create invites for the pack and must
   * be a default (non-bot) user. Returns the created invite with full metadata including usage
   * statistics.
   *
   * Parameters:
   * 	 @param packInviteCreateRequest 
   * 	 @param packId The ID of the pack
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.Any] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun createPackInvite(
    packInviteCreateRequest: PackInviteCreateRequest,
    packId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<Any> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/packs/${packId}/invites"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(packInviteCreateRequest)
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
