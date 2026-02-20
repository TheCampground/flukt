package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Limit configuration with rules and trait definitions
 */
public data class WellKnownFluxerResponseLimits(
  /**
   * Wire format version
   */
  @param:JsonProperty(
    "version",
    required = true,
  )
  @get:JsonProperty("version")
  @get:NotNull
  public val version: Int,
  /**
   * Available trait definitions (e.g., "premium")
   */
  @param:JsonProperty("traitDefinitions")
  @get:JsonProperty("traitDefinitions")
  @get:NotNull
  public val traitDefinitions: List<String>,
  /**
   * Array of limit rules to evaluate
   */
  @param:JsonProperty("rules")
  @get:JsonProperty("rules")
  @get:NotNull
  @get:Valid
  public val rules: List<LimitRuleResponse>,
  /**
   * Hash of the default limit values for cache invalidation
   */
  @param:JsonProperty("defaultsHash")
  @get:JsonProperty("defaultsHash")
  @get:NotNull
  public val defaultsHash: String,
)
