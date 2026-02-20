package app.fluxer.client

import app.fluxer.models.OAuth2TokenResponse
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
import kotlin.Any
import kotlinx.coroutines.CancellationException

public class Oauth2TokenClient(
  private val httpClient: HttpClient,
) {
  /**
   * Exchange OAuth2 token
   * Exchanges authorization code or other grant type for access tokens. Supports authorization
   * code, refresh token, and client credentials flows. Client authentication via authorization header
   * or client credentials.
   *
   * Parameters:
   * 	 @param tokenRequest 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.OAuth2TokenResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun exchangeOauth2Token(tokenRequest: Any, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<OAuth2TokenResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/oauth2/token"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(tokenRequest)
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
