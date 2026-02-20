package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

public enum class DonationCheckoutRequestInterval(
  @JsonValue
  public val `value`: String,
) {
  MONTH("month"),
  YEAR("year"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, DonationCheckoutRequestInterval> =
        entries.associateBy(DonationCheckoutRequestInterval::value)

    public fun fromValue(`value`: String): DonationCheckoutRequestInterval? = mapping[value]
  }
}
