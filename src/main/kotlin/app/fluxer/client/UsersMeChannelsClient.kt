package app.fluxer.client

import app.fluxer.models.ChannelResponse
import app.fluxer.models.CreatePrivateChannelRequest
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
import kotlin.collections.List
import kotlinx.coroutines.CancellationException

public class UsersMeChannelsClient(
  private val httpClient: HttpClient,
) {
  /**
   * List private channels
   * Retrieves all private channels (direct messages) accessible to the current user. Returns list
   * of channel objects with metadata including recipient information.
   *
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.collections.List<app.fluxer.models.ChannelResponse>] if
   * the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listPrivateChannels(apiConfiguration: ApiConfiguration = ApiConfiguration()):
      NetworkResult<List<ChannelResponse>> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/channels"""

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
   * Create private channel
   * Creates a new private channel (direct message) between the current user and one or more
   * recipients. Returns the newly created channel object.
   *
   * Parameters:
   * 	 @param createPrivateChannelRequest 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.ChannelResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun createPrivateChannel(createPrivateChannelRequest: CreatePrivateChannelRequest,
      apiConfiguration: ApiConfiguration = ApiConfiguration()): NetworkResult<ChannelResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/channels"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(createPrivateChannelRequest)
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
