package app.fluxer.client

import app.fluxer.models.NcmecSubmissionStatusResponse
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
import kotlin.String
import kotlinx.coroutines.CancellationException

public class AdminReportsNcmecStatusClient(
  private val httpClient: HttpClient,
) {
  /**
   * Get NCMEC submission status
   * Retrieve the submission status of a report to the National Center for Missing & Exploited
   * Children. Shows whether the report has been submitted and the current status with NCMEC.
   *
   * Parameters:
   * 	 @param reportId The report id
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.NcmecSubmissionStatusResponse] if the request
   * was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun getNcmecSubmissionStatus(reportId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<NcmecSubmissionStatusResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/admin/reports/${reportId}/ncmec-status"""

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
