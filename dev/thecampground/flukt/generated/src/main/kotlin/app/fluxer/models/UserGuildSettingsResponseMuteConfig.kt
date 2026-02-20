package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.Int

public data class UserGuildSettingsResponseMuteConfig(
  /**
   * ISO8601 timestamp of when the mute expires
   */
  @param:JsonProperty("end_time")
  @get:JsonProperty("end_time")
  @get:NotNull
  public val endTime: Any,
  /**
   * The selected mute duration in seconds
   */
  @param:JsonProperty(
    "selected_time_window",
    required = true,
  )
  @get:JsonProperty("selected_time_window")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val selectedTimeWindow: Int,
)
