package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Currency for the prices
 */
public enum class PriceIdsResponseCurrency(
  @JsonValue
  public val `value`: String,
) {
  USD("USD"),
  EUR("EUR"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, PriceIdsResponseCurrency> =
        entries.associateBy(PriceIdsResponseCurrency::value)

    public fun fromValue(`value`: String): PriceIdsResponseCurrency? = mapping[value]
  }
}
