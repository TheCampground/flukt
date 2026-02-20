package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class PriceIdsResponse(
  @param:JsonProperty("monthly")
  @get:JsonProperty("monthly")
  public val monthly: String? = null,
  @param:JsonProperty("yearly")
  @get:JsonProperty("yearly")
  public val yearly: String? = null,
  @param:JsonProperty("gift_1_month")
  @get:JsonProperty("gift_1_month")
  public val gift1Month: String? = null,
  @param:JsonProperty("gift_1_year")
  @get:JsonProperty("gift_1_year")
  public val gift1Year: String? = null,
  /**
   * Currency for the prices
   */
  @param:JsonProperty("currency")
  @get:JsonProperty("currency")
  @get:NotNull
  public val currency: PriceIdsResponseCurrency,
)
