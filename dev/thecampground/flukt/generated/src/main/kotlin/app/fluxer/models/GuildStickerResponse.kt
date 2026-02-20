package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class GuildStickerResponse(
  /**
   * The unique identifier for this sticker
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The name of the sticker
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * The description of the sticker
   */
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  @get:NotNull
  public val description: String,
  /**
   * Autocomplete/suggestion tags for the sticker
   */
  @param:JsonProperty("tags")
  @get:JsonProperty("tags")
  @get:NotNull
  @get:Size(max = 100)
  public val tags: List<String>,
  /**
   * Whether this sticker is animated
   */
  @param:JsonProperty(
    "animated",
    required = true,
  )
  @get:JsonProperty("animated")
  @get:NotNull
  public val animated: Boolean,
)
