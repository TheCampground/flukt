package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.math.BigDecimal
import kotlin.String
import kotlin.collections.Map

/**
 * Limit rules
 */
public data class LimitConfigUpdateRequestRules(
  /**
   * Unique rule identifier
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Size(min = 1)
  public val id: String,
  /**
   * Optional filters that scope the rule
   */
  @param:JsonProperty("filters")
  @get:JsonProperty("filters")
  @get:Valid
  public val filters: LimitConfigUpdateRequestFilters? = null,
  /**
   * Per-limit key values
   */
  @param:JsonProperty("limits")
  @get:JsonProperty("limits")
  @get:NotNull
  public val limits: Map<String, BigDecimal?>,
)
