package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.String
import kotlin.collections.Map

public data class LimitRuleResponse(
  /**
   * Unique identifier for this limit rule
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  @param:JsonProperty("filters")
  @get:JsonProperty("filters")
  @get:Valid
  public val filters: LimitFilterResponse? = null,
  /**
   * Map of limit keys to their override values (differences from defaults)
   */
  @param:JsonProperty("overrides")
  @get:JsonProperty("overrides")
  @get:NotNull
  public val overrides: Map<String, BigDecimal?>,
)
