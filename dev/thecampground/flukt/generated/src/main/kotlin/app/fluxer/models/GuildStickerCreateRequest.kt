package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.ByteArray
import kotlin.String
import kotlin.collections.List

public data class GuildStickerCreateRequest(
  /**
   * The name of the sticker (2-30 characters)
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  public val description: String? = null,
  /**
   * Array of autocomplete/suggestion tags (max 10 tags, each 1-30 characters)
   */
  @param:JsonProperty("tags")
  @get:JsonProperty("tags")
  @get:Size(
    min = 0,
    max = 10,
  )
  public val tags: List<String>? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("image")
  @get:JsonProperty("image")
  @get:NotNull
  public val image: ByteArray,
)
