package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull

public data class MessageShredStatusNotFoundResponse(
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: MessageShredStatusNotFoundResponseStatus,
)
