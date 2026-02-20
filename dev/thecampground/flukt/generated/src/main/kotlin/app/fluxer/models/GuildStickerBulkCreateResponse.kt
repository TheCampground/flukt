package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class GuildStickerBulkCreateResponse(
  /**
   * Successfully created stickers
   */
  @param:JsonProperty("success")
  @get:JsonProperty("success")
  @get:NotNull
  @get:Size(max = 500)
  @get:Valid
  public val success: List<GuildStickerResponse>,
  /**
   * Stickers that failed to create
   */
  @param:JsonProperty("failed")
  @get:JsonProperty("failed")
  @get:NotNull
  @get:Size(max = 500)
  @get:Valid
  public val failed: List<GuildStickerBulkCreateResponseFailed>,
)
