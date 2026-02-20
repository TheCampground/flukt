package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.String
import kotlin.collections.List

/**
 * New limit configuration snapshot
 */
public data class LimitConfigUpdateRequestLimitConfig(
  /**
   * Trait definitions used by rules
   */
  @param:JsonProperty("traitDefinitions")
  @get:JsonProperty("traitDefinitions")
  public val traitDefinitions: List<String>? = null,
  /**
   * Limit rules
   */
  @param:JsonProperty("rules")
  @get:JsonProperty("rules")
  @get:NotNull
  @get:Valid
  public val rules: List<LimitConfigUpdateRequestRules>,
)
