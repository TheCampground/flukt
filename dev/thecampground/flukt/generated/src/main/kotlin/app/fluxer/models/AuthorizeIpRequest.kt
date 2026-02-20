package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class AuthorizeIpRequest(
  /**
   * The IP authorization token from email
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  @get:NotNull
  public val token: String,
)
