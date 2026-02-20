package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import kotlin.collections.List

public data class LimitFilterResponse(
  /**
   * Trait filters for this limit rule
   */
  @param:JsonProperty("traits")
  @get:JsonProperty("traits")
  public val traits: List<String>? = null,
  /**
   * Guild feature filters for this limit rule
   */
  @param:JsonProperty("guildFeatures")
  @get:JsonProperty("guildFeatures")
  public val guildFeatures: List<String>? = null,
)
