package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.String

public data class MessageStickerResponse(
  /**
   * The unique identifier of the sticker
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
   * Whether the sticker is animated
   */
  @param:JsonProperty(
    "animated",
    required = true,
  )
  @get:JsonProperty("animated")
  @get:NotNull
  public val animated: Boolean,
)
