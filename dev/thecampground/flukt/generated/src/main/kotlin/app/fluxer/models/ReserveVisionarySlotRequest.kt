package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class ReserveVisionarySlotRequest(
  /**
   * Slot index to reserve (must be >= 1)
   */
  @param:JsonProperty(
    "slot_index",
    required = true,
  )
  @get:JsonProperty("slot_index")
  @get:NotNull
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val slotIndex: Int,
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^-?[0-9]+${'$'}")
  public val userId: String,
)
