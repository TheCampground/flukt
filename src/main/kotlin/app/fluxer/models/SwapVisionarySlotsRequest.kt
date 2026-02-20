package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int

public data class SwapVisionarySlotsRequest(
  /**
   * First slot index to swap (must be >= 1)
   */
  @param:JsonProperty(
    "slot_index_a",
    required = true,
  )
  @get:JsonProperty("slot_index_a")
  @get:NotNull
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val slotIndexA: Int,
  /**
   * Second slot index to swap (must be >= 1)
   */
  @param:JsonProperty(
    "slot_index_b",
    required = true,
  )
  @get:JsonProperty("slot_index_b")
  @get:NotNull
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val slotIndexB: Int,
)
