package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class GuildStickerBulkCreateRequest(
  /**
   * Array of sticker objects to create (1-50 stickers per batch)
   */
  @param:JsonProperty("stickers")
  @get:JsonProperty("stickers")
  @get:NotNull
  @get:Size(
    min = 1,
    max = 50,
  )
  @get:Valid
  public val stickers: List<GuildStickerCreateRequest>,
)
