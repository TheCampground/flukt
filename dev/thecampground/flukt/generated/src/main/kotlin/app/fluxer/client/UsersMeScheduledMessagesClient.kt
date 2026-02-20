package app.fluxer.client

import app.fluxer.models.ScheduledMessageResponseSchema
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`get`
import io.ktor.client.request.`header`
import io.ktor.client.request.delete
import io.ktor.client.request.headers
import io.ktor.client.request.patch
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.coroutines.CancellationException

public class UsersMeScheduledMessagesClient(
  private val httpClient: HttpClient,
) {
  /**
   * List scheduled messages
   * Retrieves all scheduled messages for the current user. Returns list of messages that are
   * scheduled to be sent at a future date and time.
   *
   *
   * Returns:
   * 	[NetworkResult.Success] with
   * [kotlin.collections.List<app.fluxer.models.ScheduledMessageResponseSchema>] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listScheduledMessages(apiConfiguration: ApiConfiguration = ApiConfiguration()):
      NetworkResult<List<ScheduledMessageResponseSchema>> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/scheduled-messages"""

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
   * Get scheduled message
   * Retrieves details of a specific scheduled message by ID. Returns the message content, scheduled
   * send time, and status.
   *
   * Parameters:
   * 	 @param scheduledMessageId The scheduled message id
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.ScheduledMessageResponseSchema] if the request
   * was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun getScheduledMessage(scheduledMessageId: String,
      apiConfiguration: ApiConfiguration = ApiConfiguration()):
      NetworkResult<ScheduledMessageResponseSchema> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/scheduled-messages/${scheduledMessageId}"""

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
   * Cancel scheduled message
   * Cancels and deletes a scheduled message before it is sent. The message will not be delivered if
   * cancelled.
   *
   * Parameters:
   * 	 @param scheduledMessageId The scheduled message id
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.Unit] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun cancelScheduledMessage(scheduledMessageId: String,
      apiConfiguration: ApiConfiguration = ApiConfiguration()): NetworkResult<Unit> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/scheduled-messages/${scheduledMessageId}"""

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

  /**
   * Update scheduled message
   * Updates an existing scheduled message before it is sent. Can modify message content, scheduled
   * time, and timezone. Returns updated scheduled message details.
   *
   * Parameters:
   * 	 @param scheduledMessageId The scheduled message id
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.ScheduledMessageResponseSchema] if the request
   * was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun updateScheduledMessage(scheduledMessageId: String,
      apiConfiguration: ApiConfiguration = ApiConfiguration()):
      NetworkResult<ScheduledMessageResponseSchema> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/scheduled-messages/${scheduledMessageId}"""

    return try {
      val response = httpClient.patch(url) {
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
