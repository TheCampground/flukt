package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid

public data class GetVoiceRegionResponse(
  @param:JsonProperty("region")
  @get:JsonProperty("region")
  @get:Valid
  public val region: VoiceRegionWithServersResponse?,
)
