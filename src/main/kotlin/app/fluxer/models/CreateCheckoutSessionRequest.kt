package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class CreateCheckoutSessionRequest(
  /**
   * The Stripe price ID for the subscription plan
   */
  @param:JsonProperty("price_id")
  @get:JsonProperty("price_id")
  @get:NotNull
  public val priceId: String,
)
