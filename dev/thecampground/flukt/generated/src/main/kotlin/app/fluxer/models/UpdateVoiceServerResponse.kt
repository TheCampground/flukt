package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull

public data class UpdateVoiceServerResponse(
  /**
   * Updated voice server
   */
  @param:JsonProperty("server")
  @get:JsonProperty("server")
  @get:NotNull
  @get:Valid
  public val server: UpdateVoiceServerResponseServer,
)
