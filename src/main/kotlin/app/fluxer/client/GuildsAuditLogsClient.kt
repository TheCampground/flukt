package app.fluxer.client

import app.fluxer.models.GuildAuditLogListResponse
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
import kotlin.String
import kotlinx.coroutines.CancellationException

public class GuildsAuditLogsClient(
  private val httpClient: HttpClient,
) {
  /**
   * List guild audit logs
   * List guild audit logs. Only default users can access. Requires view_audit_logs permission.
   * Returns guild activity history with pagination and action filtering.
   *
   * Parameters:
   * 	 @param guildId The ID of the guild
   * 	 @param limit 
   * 	 @param before 
   * 	 @param after 
   * 	 @param userId 
   * 	 @param actionType 
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.GuildAuditLogListResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listGuildAuditLogs(
    guildId: String,
    limit: Int? = null,
    before: String? = null,
    after: String? = null,
    userId: String? = null,
    actionType: Int? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<GuildAuditLogListResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/guilds/${guildId}/audit-logs""")
      val params = buildList {
        limit?.let { add("limit=${it}") }
        before?.let { add("before=${it}") }
        after?.let { add("after=${it}") }
        userId?.let { add("user_id=${it}") }
        actionType?.let { add("action_type=${it}") }
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
