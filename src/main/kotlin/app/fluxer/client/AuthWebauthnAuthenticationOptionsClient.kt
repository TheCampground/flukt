package app.fluxer.client

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
import kotlin.Any
import kotlin.String
import kotlin.collections.Map
import kotlinx.coroutines.CancellationException

public class AuthWebauthnAuthenticationOptionsClient(
  private val httpClient: HttpClient,
) {
  /**
   * Get WebAuthn authentication options
   * Retrieve WebAuthn authentication challenge and options for passwordless login with biometrics
   * or security keys.
   *
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.collections.Map<kotlin.String, kotlin.Any?>] if the
   * request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun getWebauthnAuthenticationOptions(apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<Map<String, Any?>> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/auth/webauthn/authentication-options"""

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
