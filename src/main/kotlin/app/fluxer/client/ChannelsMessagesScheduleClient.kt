package app.fluxer.client

import app.fluxer.models.ScheduledMessageResponseSchema
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`header`
import io.ktor.client.request.headers
import io.ktor.client.request.post
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.String
import kotlinx.coroutines.CancellationException

public class ChannelsMessagesScheduleClient(
  private val httpClient: HttpClient,
) {
  /**
   * Schedule a message to send later
   * Schedules a message to be sent at a specified time. Only available for regular user accounts.
   * Requires permission to send messages in the target channel. Message is sent automatically at the
   * scheduled time. Returns the scheduled message object with delivery time.
   *
   * Parameters:
   * 	 @param channelId The ID of the channel
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.ScheduledMessageResponseSchema] if the request
   * was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun scheduleMessage(channelId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<ScheduledMessageResponseSchema> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/channels/${channelId}/messages/schedule"""

    return try {
      val response = httpClient.post(url) {
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
