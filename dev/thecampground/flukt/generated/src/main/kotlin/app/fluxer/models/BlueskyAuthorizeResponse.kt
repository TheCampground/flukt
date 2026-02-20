package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class BlueskyAuthorizeResponse(
  /**
   * The URL to redirect the user to for Bluesky authorisation
   */
  @param:JsonProperty("authorize_url")
  @get:JsonProperty("authorize_url")
  @get:NotNull
  public val authorizeUrl: String,
)
