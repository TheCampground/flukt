package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.Int

public data class UserGuildSettingsUpdateRequestMuteConfig(
  /**
   * When the mute expires
   */
  @param:JsonProperty("end_time")
  @get:JsonProperty("end_time")
  public val endTime: Any? = null,
  /**
   * Selected mute duration
   */
  @param:JsonProperty(
    "selected_time_window",
    required = true,
  )
  @get:JsonProperty("selected_time_window")
  @get:NotNull
  public val selectedTimeWindow: Int,
)
