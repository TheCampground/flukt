package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class EmailChangeBouncedRequestNewRequest(
  @param:JsonProperty("new_email")
  @get:JsonProperty("new_email")
  @get:NotNull
  public val newEmail: String,
)
