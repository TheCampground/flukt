package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class SsoStartRequest(
  @param:JsonProperty("redirect_to")
  @get:JsonProperty("redirect_to")
  public val redirectTo: String? = null,
)
