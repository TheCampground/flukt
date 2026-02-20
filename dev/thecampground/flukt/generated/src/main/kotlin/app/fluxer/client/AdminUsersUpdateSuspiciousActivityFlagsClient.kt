package app.fluxer.client

import app.fluxer.models.UpdateSuspiciousActivityFlagsRequest
import app.fluxer.models.UserMutationResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`header`
import io.ktor.client.request.headers
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlinx.coroutines.CancellationException

public class AdminUsersUpdateSuspiciousActivityFlagsClient(
  private val httpClient: HttpClient,
) {
  /**
   * Update suspicious activity flags
   * Flag user as suspicious for account abuse, fraud, or policy violations. Enables enforcement
   * actions and rate limiting. Creates audit log entry. Requires USER_UPDATE_SUSPICIOUS_ACTIVITY
   * permission.
   *
   * Parameters:
   * 	 @param updateSuspiciousActivityFlagsRequest 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.UserMutationResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend
      fun updateSuspiciousActivityFlags(updateSuspiciousActivityFlagsRequest: UpdateSuspiciousActivityFlagsRequest,
      apiConfiguration: ApiConfiguration = ApiConfiguration()):
      NetworkResult<UserMutationResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/admin/users/update-suspicious-activity-flags"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(updateSuspiciousActivityFlagsRequest)
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
