package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class ListUserSessionsResponse(
  @param:JsonProperty("sessions")
  @get:JsonProperty("sessions")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val sessions: List<UserSessionResponse>,
)
