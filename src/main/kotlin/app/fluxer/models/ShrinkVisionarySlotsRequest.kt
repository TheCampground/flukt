package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int

public data class ShrinkVisionarySlotsRequest(
  /**
   * Target total number of slots (removes from highest indices, minimum 0 slots)
   */
  @param:JsonProperty(
    "target_count",
    required = true,
  )
  @get:JsonProperty("target_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "100000",
    inclusive = true,
  )
  public val targetCount: Int,
)
