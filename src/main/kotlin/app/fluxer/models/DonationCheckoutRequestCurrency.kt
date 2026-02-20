package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Currency for the donation
 */
public enum class DonationCheckoutRequestCurrency(
  @JsonValue
  public val `value`: String,
) {
  USD("usd"),
  EUR("eur"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, DonationCheckoutRequestCurrency> =
        entries.associateBy(DonationCheckoutRequestCurrency::value)

    public fun fromValue(`value`: String): DonationCheckoutRequestCurrency? = mapping[value]
  }
}
