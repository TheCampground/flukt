package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull

public data class PackDashboardResponse(
  /**
   * Dashboard section for emoji packs
   */
  @param:JsonProperty("emoji")
  @get:JsonProperty("emoji")
  @get:NotNull
  @get:Valid
  public val emoji: PackDashboardResponseEmoji,
  /**
   * Dashboard section for sticker packs
   */
  @param:JsonProperty("sticker")
  @get:JsonProperty("sticker")
  @get:NotNull
  @get:Valid
  public val sticker: PackDashboardResponseSticker,
)
