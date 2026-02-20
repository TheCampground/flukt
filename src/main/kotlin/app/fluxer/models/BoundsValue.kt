package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal

public data class BoundsValue(
  @param:JsonProperty("min")
  @get:JsonProperty("min")
  @get:NotNull
  public val min: BigDecimal,
  @param:JsonProperty("max")
  @get:JsonProperty("max")
  @get:NotNull
  public val max: BigDecimal,
)
