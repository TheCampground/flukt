package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Type of gift subscription
 */
public enum class GenerateGiftCodesRequestProductType(
  @JsonValue
  public val `value`: String,
) {
  GIFT_1_MONTH("gift_1_month"),
  GIFT_1_YEAR("gift_1_year"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, GenerateGiftCodesRequestProductType> =
        entries.associateBy(GenerateGiftCodesRequestProductType::value)

    public fun fromValue(`value`: String): GenerateGiftCodesRequestProductType? = mapping[value]
  }
}
