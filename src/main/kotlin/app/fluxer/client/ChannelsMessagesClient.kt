package app.fluxer.client

import app.fluxer.models.MessageResponseSchema
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`get`
import io.ktor.client.request.`header`
import io.ktor.client.request.delete
import io.ktor.client.request.headers
import io.ktor.client.request.patch
import io.ktor.client.request.post
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.coroutines.CancellationException

public class ChannelsMessagesClient(
  private val httpClient: HttpClient,
) {
  /**
   * List messages in a channel
   * Retrieves a paginated list of messages from a channel. User must have permission to view the
   * channel. Supports pagination via limit, before, after, and around parameters. Returns messages in
   * reverse chronological order (newest first).
   *
   * Parameters:
   * 	 @param channelId The ID of the channel
   * 	 @param limit 
   * 	 @param before 
   * 	 @param after 
   * 	 @param around 
   *
   * Returns:
   * 	[NetworkResult.Success] with
   * [kotlin.collections.List<app.fluxer.models.MessageResponseSchema>] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listMessages(
    channelId: String,
    limit: String? = null,
    before: String? = null,
    after: String? = null,
    around: String? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<List<MessageResponseSchema>> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/channels/${channelId}/messages""")
      val params = buildList {
        limit?.let { add("limit=${it}") }
        before?.let { add("before=${it}") }
        after?.let { add("after=${it}") }
        around?.let { add("around=${it}") }
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
   * Send a message
   * Sends a new message to a channel. Requires permission to send messages in the target channel.
   * Supports text content, embeds, attachments (multipart), and mentions. Returns the created message
   * object with full details.
   *
   * Parameters:
   * 	 @param channelId The ID of the channel
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.MessageResponseSchema] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun sendMessage(channelId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<MessageResponseSchema> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/channels/${channelId}/messages"""

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

  /**
   * Fetch a message
   * Retrieves a specific message by ID. User must have permission to view the channel and the
   * message must exist. Returns full message details including content, author, reactions, and
   * attachments.
   *
   * Parameters:
   * 	 @param channelId The ID of the channel
   * 	 @param messageId The ID of the message
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.MessageResponseSchema] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun getMessage(
    channelId: String,
    messageId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<MessageResponseSchema> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/channels/${channelId}/messages/${messageId}"""

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
   * Edit a message
   * Updates an existing message. Only the message author can edit messages (or admins with proper
   * permissions). Supports updating content, embeds, and attachments. Returns the updated message
   * object. Maintains original message ID and timestamps.
   *
   * Parameters:
   * 	 @param channelId The ID of the channel
   * 	 @param messageId The ID of the message
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.MessageResponseSchema] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun editMessage(
    channelId: String,
    messageId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<MessageResponseSchema> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/channels/${channelId}/messages/${messageId}"""

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

  /**
   * Delete a message
   * Deletes a message permanently. Only the message author can delete messages (or
   * admins/moderators with proper permissions). Cannot be undone. Returns 204 No Content on success.
   *
   * Parameters:
   * 	 @param channelId The ID of the channel
   * 	 @param messageId The ID of the message
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.Unit] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun deleteMessage2(
    channelId: String,
    messageId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<Unit> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/channels/${channelId}/messages/${messageId}"""

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
