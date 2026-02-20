package app.fluxer.client

import app.fluxer.models.ChannelPinsResponse
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
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.String
import kotlinx.coroutines.CancellationException

public class ChannelsMessagesPinsClient(
  private val httpClient: HttpClient,
) {
  /**
   * List pinned messages
   * Retrieves a paginated list of messages pinned in a channel. User must have permission to view
   * the channel. Supports pagination via limit and before parameters. Returns pinned messages with
   * their pin timestamps.
   *
   * Parameters:
   * 	 @param channelId The ID of the channel
   * 	 @param limit 
   * 	 @param before 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.ChannelPinsResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listPinnedMessages(
    channelId: String,
    limit: Int? = null,
    before: OffsetDateTime? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<ChannelPinsResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/channels/${channelId}/messages/pins""")
      val params = buildList {
        limit?.let { add("limit=${it}") }
        before?.let { add("before=${it}") }
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
