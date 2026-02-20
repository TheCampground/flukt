package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String

public data class DonationCheckoutRequest(
  /**
   * Donor email address
   */
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  @get:NotNull
  @get:Size(max = 254)
  public val email: String,
  /**
   * Donation amount in cents (500-100000)
   */
  @param:JsonProperty(
    "amount_cents",
    required = true,
  )
  @get:JsonProperty("amount_cents")
  @get:NotNull
  @get:DecimalMin(
    value = "500",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "100000",
    inclusive = true,
  )
  public val amountCents: Int,
  /**
   * Currency for the donation
   */
  @param:JsonProperty("currency")
  @get:JsonProperty("currency")
  @get:NotNull
  public val currency: DonationCheckoutRequestCurrency,
  @param:JsonProperty("interval")
  @get:JsonProperty("interval")
  public val interval: DonationCheckoutRequestInterval?,
)
