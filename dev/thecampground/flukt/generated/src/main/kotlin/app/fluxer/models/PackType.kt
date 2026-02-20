package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * The type of pack (emoji or sticker)
 */
public enum class PackType(
  @JsonValue
  public val `value`: String,
) {
  EMOJI("emoji"),
  STICKER("sticker"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, PackType> = entries.associateBy(PackType::value)

    public fun fromValue(`value`: String): PackType? = mapping[value]
  }
}
