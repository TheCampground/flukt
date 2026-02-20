package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import java.net.URI

public data class DonationCheckoutResponse(
  /**
   * Stripe checkout URL to redirect the user to
   */
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  @get:NotNull
  public val url: URI,
)
