package app.fluxer.client

import app.fluxer.models.GuildEmojiCreateRequest
import app.fluxer.models.GuildEmojiResponse
import app.fluxer.models.GuildEmojiUpdateRequest
import app.fluxer.models.GuildEmojiWithUserResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.NoTransformationFoundException
import io.ktor.client.call.body
import io.ktor.client.plugins.ResponseException
import io.ktor.client.request.`get`
import io.ktor.client.request.`header`
import io.ktor.client.request.delete
import io.ktor.client.request.headers
import io.ktor.client.request.patch
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.client.statement.bodyAsText
import io.ktor.http.isSuccess
import io.ktor.serialization.ContentConvertException
import java.io.IOException
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.coroutines.CancellationException

public class PacksEmojisClient(
  private val httpClient: HttpClient,
) {
  /**
   * Create pack emoji
   * Creates a new emoji within the specified pack. Requires the pack ID in the path and emoji
   * metadata (name and image data) in the request body. Returns the newly created emoji with its
   * generated ID.
   *
   * Parameters:
   * 	 @param guildEmojiCreateRequest 
   * 	 @param packId The ID of the pack
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.GuildEmojiResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun createPackEmoji(
    guildEmojiCreateRequest: GuildEmojiCreateRequest,
    packId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<GuildEmojiResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/packs/emojis/${packId}"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(guildEmojiCreateRequest)
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
   * List pack emojis
   * Returns a list of all emojis contained within the specified pack, including emoji metadata and
   * creator information. Results include emoji ID, name, image URL, and the user who created each
   * emoji.
   *
   * Parameters:
   * 	 @param packId The ID of the pack
   *
   * Returns:
   * 	[NetworkResult.Success] with
   * [kotlin.collections.List<app.fluxer.models.GuildEmojiWithUserResponse>] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listPackEmojis(packId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<List<GuildEmojiWithUserResponse>> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/packs/emojis/${packId}"""

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
   * Update pack emoji
   * Updates the name of an existing emoji within the specified pack. Requires both pack ID and
   * emoji ID in the path parameters. Returns the updated emoji with its new name and all existing
   * metadata.
   *
   * Parameters:
   * 	 @param guildEmojiUpdateRequest 
   * 	 @param packId The ID of the pack
   * 	 @param emojiId The ID of the emoji
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.GuildEmojiResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun updatePackEmoji(
    guildEmojiUpdateRequest: GuildEmojiUpdateRequest,
    packId: String,
    emojiId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<GuildEmojiResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/packs/emojis/${packId}/${emojiId}"""

    return try {
      val response = httpClient.patch(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(guildEmojiUpdateRequest)
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
   * Delete pack emoji
   * Permanently deletes an emoji from the specified pack. Requires both pack ID and emoji ID in the
   * path parameters. Accepts an optional "purge" query parameter to control whether associated assets
   * are immediately deleted.
   *
   * Parameters:
   * 	 @param packId The ID of the pack
   * 	 @param emojiId The ID of the emoji
   * 	 @param purge 
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.Unit] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun deletePackEmoji(
    packId: String,
    emojiId: String,
    purge: String? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<Unit> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/packs/emojis/${packId}/${emojiId}""")
      val params = buildList {
        purge?.let { add("purge=${it}") }
      }
      if (params.isNotEmpty()) append("?").append(params.joinToString("&"))
    }

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
