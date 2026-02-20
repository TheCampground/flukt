package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String
import kotlin.collections.List

/**
 * Optional filters that scope the rule
 */
public data class LimitConfigUpdateRequestFilters(
  /**
   * Trait filters that must match for the rule to apply
   */
  @param:JsonProperty("traits")
  @get:JsonProperty("traits")
  public val traits: List<String>? = null,
  /**
   * Guild feature flags required for the rule to apply
   */
  @param:JsonProperty("guildFeatures")
  @get:JsonProperty("guildFeatures")
  public val guildFeatures: List<String>? = null,
)
