package app.fluxer.client

import app.fluxer.models.CreateFavoriteMemeBodySchema
import app.fluxer.models.FavoriteMemeResponse
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
import kotlin.String
import kotlinx.coroutines.CancellationException

public class ChannelsMessagesMemesClient(
  private val httpClient: HttpClient,
) {
  /**
   * Create meme from message
   * Saves a message attachment as a favorite meme.
   *
   * Parameters:
   * 	 @param createFavoriteMemeBodySchema 
   * 	 @param channelId The ID of the channel
   * 	 @param messageId The ID of the message
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.FavoriteMemeResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun createMemeFromMessage(
    createFavoriteMemeBodySchema: CreateFavoriteMemeBodySchema,
    channelId: String,
    messageId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<FavoriteMemeResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/channels/${channelId}/messages/${messageId}/memes"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(createFavoriteMemeBodySchema)
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
