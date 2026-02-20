package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class ListVoiceServersRequest(
  /**
   * ID of the region to list servers for
   */
  @param:JsonProperty("region_id")
  @get:JsonProperty("region_id")
  @get:NotNull
  public val regionId: String,
)
