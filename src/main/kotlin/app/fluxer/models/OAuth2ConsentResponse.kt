package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class OAuth2ConsentResponse(
  /**
   * The URL to redirect the user to after consent
   */
  @param:JsonProperty("redirect_to")
  @get:JsonProperty("redirect_to")
  @get:NotNull
  public val redirectTo: String,
)
