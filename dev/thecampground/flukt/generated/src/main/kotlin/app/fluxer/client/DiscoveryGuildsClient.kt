package app.fluxer.client

import app.fluxer.models.DiscoveryGuildListResponse
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
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlinx.coroutines.CancellationException

public class DiscoveryGuildsClient(
  private val httpClient: HttpClient,
) {
  /**
   * Search discoverable guilds
   * Search for guilds listed in the discovery directory.
   *
   * Parameters:
   * 	 @param query 
   * 	 @param category 
   * 	 @param sortBy 
   * 	 @param limit 
   * 	 @param offset 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.DiscoveryGuildListResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun searchDiscoveryGuilds(
    query: String? = null,
    category: Int? = null,
    sortBy: String? = null,
    limit: Int? = null,
    offset: Long? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<DiscoveryGuildListResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/discovery/guilds""")
      val params = buildList {
        query?.let { add("query=${it}") }
        category?.let { add("category=${it}") }
        sortBy?.let { add("sort_by=${it}") }
        limit?.let { add("limit=${it}") }
        offset?.let { add("offset=${it}") }
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
