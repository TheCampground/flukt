package app.fluxer.client

import app.fluxer.models.PushSubscriptionsListResponse
import app.fluxer.models.SuccessResponse
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
import kotlin.String
import kotlinx.coroutines.CancellationException

public class UsersMePushSubscriptionsClient(
  private val httpClient: HttpClient,
) {
  /**
   * List push subscriptions
   * Retrieves all push notification subscriptions for the current user, including subscription IDs
   * and user agent information for each subscription.
   *
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.PushSubscriptionsListResponse] if the request
   * was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listPushSubscriptions(apiConfiguration: ApiConfiguration = ApiConfiguration()):
      NetworkResult<PushSubscriptionsListResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/push/subscriptions"""

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
   * Unsubscribe from push notifications
   * Unregisters a push notification subscription for the current user. Push notifications will no
   * longer be sent to this subscription endpoint.
   *
   * Parameters:
   * 	 @param subscriptionId The subscription id
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.SuccessResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun unsubscribeFromPushNotifications(subscriptionId: String,
      apiConfiguration: ApiConfiguration = ApiConfiguration()): NetworkResult<SuccessResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/push/subscriptions/${subscriptionId}"""

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
