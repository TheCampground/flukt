package app.fluxer.client

import app.fluxer.models.CreateSystemDmJobRequest
import app.fluxer.models.ListSystemDmJobsResponse
import app.fluxer.models.SystemDmJobResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`get`
import io.ktor.client.request.`header`
import io.ktor.client.request.headers
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.String
import kotlinx.coroutines.CancellationException

public class AdminSystemDmJobsClient(
  private val httpClient: HttpClient,
) {
  /**
   * Create system DM job
   * Creates a system DM broadcast job to send messages to users matching registration date
   * criteria. Supports date range filtering and guild exclusions. Requires SYSTEM_DM_SEND permission.
   *
   * Parameters:
   * 	 @param createSystemDmJobRequest 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.SystemDmJobResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun createSystemDmJob(createSystemDmJobRequest: CreateSystemDmJobRequest,
      apiConfiguration: ApiConfiguration = ApiConfiguration()): NetworkResult<SystemDmJobResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/admin/system-dm-jobs"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(createSystemDmJobRequest)
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
   * List system DM jobs
   * Lists system DM broadcast jobs with pagination. Shows job status, creation time, and content
   * preview. Requires SYSTEM_DM_SEND permission.
   *
   * Parameters:
   * 	 @param limit 
   * 	 @param beforeJobId 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.ListSystemDmJobsResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listSystemDmJobs(
    limit: String? = null,
    beforeJobId: String? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<ListSystemDmJobsResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/admin/system-dm-jobs""")
      val params = buildList {
        limit?.let { add("limit=${it}") }
        beforeJobId?.let { add("before_job_id=${it}") }
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
}
