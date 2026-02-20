package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class ListSnowflakeReservationsResponse(
  /**
   * List of snowflake reservations
   */
  @param:JsonProperty("reservations")
  @get:JsonProperty("reservations")
  @get:NotNull
  @get:Size(max = 1_000)
  @get:Valid
  public val reservations: List<SnowflakeReservationEntry>,
)
