package app.fluxer.client

import app.fluxer.models.ThemeCreateRequest
import app.fluxer.models.ThemeCreateResponse
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

public class UsersMeThemesClient(
  private val httpClient: HttpClient,
) {
  /**
   * Create theme
   * Creates a new custom theme with CSS styling that can be shared with other users.
   *
   * Parameters:
   * 	 @param themeCreateRequest 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.ThemeCreateResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun createTheme(themeCreateRequest: ThemeCreateRequest,
      apiConfiguration: ApiConfiguration = ApiConfiguration()): NetworkResult<ThemeCreateResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/users/@me/themes"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(themeCreateRequest)
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
