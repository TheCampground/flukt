package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import kotlin.Int

public data class UpdateConnectionRequest(
  @param:JsonProperty("visibility_flags")
  @get:JsonProperty("visibility_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val visibilityFlags: Int? = null,
  @param:JsonProperty("sort_order")
  @get:JsonProperty("sort_order")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val sortOrder: Int? = null,
)
