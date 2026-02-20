package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.collections.List

public data class ListVisionarySlotsResponse(
  /**
   * List of all visionary slots
   */
  @param:JsonProperty("slots")
  @get:JsonProperty("slots")
  @get:NotNull
  @get:Size(max = 10_000)
  @get:Valid
  public val slots: List<VisionarySlotSchema>,
  /**
   * Total number of slots
   */
  @param:JsonProperty(
    "total_count",
    required = true,
  )
  @get:JsonProperty("total_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val totalCount: Int,
  /**
   * Number of reserved slots
   */
  @param:JsonProperty(
    "reserved_count",
    required = true,
  )
  @get:JsonProperty("reserved_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val reservedCount: Int,
)
