package app.fluxer.client

import app.fluxer.models.GuildStickerCreateRequest
import app.fluxer.models.GuildStickerResponse
import app.fluxer.models.GuildStickerUpdateRequest
import app.fluxer.models.GuildStickerWithUserResponse
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

public class GuildsStickersClient(
  private val httpClient: HttpClient,
) {
  /**
   * Create guild sticker
   * Create guild sticker. Requires manage_emojis permission. Uploads a new sticker with name,
   * description, and tags.
   *
   * Parameters:
   * 	 @param guildStickerCreateRequest 
   * 	 @param guildId The ID of the guild
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.GuildStickerResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun createGuildSticker(
    guildStickerCreateRequest: GuildStickerCreateRequest,
    guildId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<GuildStickerResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/guilds/${guildId}/stickers"""

    return try {
      val response = httpClient.post(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(guildStickerCreateRequest)
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
   * List guild stickers
   * List guild stickers. Returns all custom stickers for the guild including metadata about
   * creators, descriptions, and tags.
   *
   * Parameters:
   * 	 @param guildId The ID of the guild
   *
   * Returns:
   * 	[NetworkResult.Success] with
   * [kotlin.collections.List<app.fluxer.models.GuildStickerWithUserResponse>] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun listGuildStickers2(guildId: String, apiConfiguration: ApiConfiguration =
      ApiConfiguration()): NetworkResult<List<GuildStickerWithUserResponse>> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/guilds/${guildId}/stickers"""

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
   * Update guild sticker
   * Update guild sticker. Requires manage_emojis permission. Updates sticker name, description, or
   * tags.
   *
   * Parameters:
   * 	 @param guildStickerUpdateRequest 
   * 	 @param guildId The ID of the guild
   * 	 @param stickerId The ID of the sticker
   *
   * Returns:
   * 	[NetworkResult.Success] with [app.fluxer.models.GuildStickerResponse] if the request was
   * successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun updateGuildSticker(
    guildStickerUpdateRequest: GuildStickerUpdateRequest,
    guildId: String,
    stickerId: String,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<GuildStickerResponse> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = basePath + """/guilds/${guildId}/stickers/${stickerId}"""

    return try {
      val response = httpClient.patch(url) {
        `header`("Accept", "application/json")
        `header`("Content-Type", "application/json")
        setBody(guildStickerUpdateRequest)
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
   * Delete guild sticker
   * Delete guild sticker. Requires manage_emojis permission. Removes a sticker from the guild;
   * optionally purges all references.
   *
   * Parameters:
   * 	 @param guildId The ID of the guild
   * 	 @param stickerId The ID of the sticker
   * 	 @param purge 
   *
   * Returns:
   * 	[NetworkResult.Success] with [kotlin.Unit] if the request was successful.
   * 	[NetworkResult.Failure] with a [NetworkError] if the request failed.
   */
  public suspend fun deleteGuildSticker(
    guildId: String,
    stickerId: String,
    purge: String? = null,
    apiConfiguration: ApiConfiguration = ApiConfiguration(),
  ): NetworkResult<Unit> {
    val basePath = apiConfiguration.basePath.trimEnd('/')
    val url = buildString {
      append(basePath)
      append("""/guilds/${guildId}/stickers/${stickerId}""")
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
