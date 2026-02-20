package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid

public data class GetVoiceServerResponse(
  @param:JsonProperty("server")
  @get:JsonProperty("server")
  @get:Valid
  public val server: VoiceServerAdminResponse?,
)
