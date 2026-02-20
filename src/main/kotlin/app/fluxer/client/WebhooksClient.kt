package app.fluxer.client

import app.fluxer.models.MessageResponseSchema
import app.fluxer.models.WebhookResponse
import app.fluxer.models.WebhookTokenResponse
import app.fluxer.models.WebhookTokenUpdateRequest
import app.fluxer.models.WebhookUpdateRequest
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
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.String
import kotlin.Unit
import kotlinx.coroutines.CancellationException

public class WebhooksClient(
  private val httpClient: HttpClient,
) {
  /**
   * Get webhook
   * Retrieves detailed information about a specific webhook by its ID. Requires authentication and
   * appropriate permissions to access the webhook.
   *
   * Parameters:
   * 	 @param webhookId The ID of the webhook
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.WebhookResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun getWebhook(webhookId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<WebhookResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/webhooks/${webhookId}"""

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
   * Update webhook
   * Updates the specified webhook with new settings such as name, avatar, or target channel. All
   * fields are optional. Returns the updated webhook object.
   *
   * Parameters:
   * 	 @param webhookUpdateRequest 
   * 	 @param webhookId The ID of the webhook
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.WebhookResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun updateWebhook(
    webhookUpdateRequest: WebhookUpdateRequest,
    webhookId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<WebhookResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/webhooks/${webhookId}"""

    return try {
      val response = httpClient.patch(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(webhookUpdateRequest)
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
   * Delete webhook
   * Permanently deletes the specified webhook. This action cannot be undone. Returns a 204 status
   * code on successful deletion.
   *
   * Parameters:
   * 	 @param webhookId The ID of the webhook
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.Unit] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun deleteWebhook(webhookId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<Unit> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/webhooks/${webhookId}"""

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
   * Get webhook with token
   * Retrieves detailed information about a specific webhook using its ID and token. No
   * authentication required as the token serves as the credential. Returns the webhook object without
   * creator user data.
   *
   * Parameters:
   * 	 @param webhookId The ID of the webhook
   * 	 @param token The token
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.WebhookTokenResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun getWebhookWithToken(
    webhookId: String,
    token: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<WebhookTokenResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/webhooks/${webhookId}/${token}"""

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
   * Update webhook with token
   * Updates the specified webhook using its ID and token for authentication. Allows modification of
   * name or avatar. Returns the updated webhook object without creator user data.
   *
   * Parameters:
   * 	 @param webhookTokenUpdateRequest 
   * 	 @param webhookId The ID of the webhook
   * 	 @param token The token
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.WebhookTokenResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun updateWebhookWithToken(
    webhookTokenUpdateRequest: WebhookTokenUpdateRequest,
    webhookId: String,
    token: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<WebhookTokenResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/webhooks/${webhookId}/${token}"""

    return try {
      val response = httpClient.patch(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(webhookTokenUpdateRequest)
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
   * Delete webhook with token
   * Permanently deletes the specified webhook using its ID and token for authentication. This
   * action cannot be undone. Returns a 204 status code on successful deletion.
   *
   * Parameters:
   * 	 @param webhookId The ID of the webhook
   * 	 @param token The token
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.Unit] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun deleteWebhookWithToken(
    webhookId: String,
    token: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<Unit> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/webhooks/${webhookId}/${token}"""

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
   * Execute webhook
   * Executes the webhook by sending a message to its configured channel. If the wait query
   * parameter is true, returns the created message object; otherwise returns a 204 status with no
   * content.
   *
   * Parameters:
   * 	 @param webhookId The ID of the webhook
   * 	 @param token The token
   * 	 @param wait 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.MessageResponseSchema] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun executeWebhook(
    webhookId: String,
    token: String,
    wait: String? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<MessageResponseSchema> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/webhooks/${webhookId}/${token}""")
      val params = buildList {
        wait?.let { add("wait=${it}") }
      }
      if (params.isNotEmpty()) append("?").append(params.joinToString("&"))
    }

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
