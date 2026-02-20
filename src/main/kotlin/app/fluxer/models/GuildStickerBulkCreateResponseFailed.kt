package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

/**
 * Stickers that failed to create
 */
public data class GuildStickerBulkCreateResponseFailed(
  /**
   * The name of the sticker that failed to create
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  /**
   * The error message explaining why the sticker failed to create
   */
  @param:JsonProperty("error")
  @get:JsonProperty("error")
  @get:NotNull
  public val error: String,
)
