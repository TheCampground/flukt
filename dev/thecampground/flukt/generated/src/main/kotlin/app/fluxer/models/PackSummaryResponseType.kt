package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The type of expression pack (emoji or sticker)
 */
public enum class PackSummaryResponseType(
  @JsonValue
  public val `value`: String,
) {
  EMOJI("emoji"),
  STICKER("sticker"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, PackSummaryResponseType> =
        entries.associateBy(PackSummaryResponseType::value)

    public fun fromValue(`value`: String): PackSummaryResponseType? = mapping[value]
  }
}
