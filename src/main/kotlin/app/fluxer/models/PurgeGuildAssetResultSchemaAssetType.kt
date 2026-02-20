package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Type of guild asset
 */
public enum class PurgeGuildAssetResultSchemaAssetType(
  @JsonValue
  public val `value`: String,
) {
  EMOJI("emoji"),
  STICKER("sticker"),
  UNKNOWN("unknown"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, PurgeGuildAssetResultSchemaAssetType> =
        entries.associateBy(PurgeGuildAssetResultSchemaAssetType::value)

    public fun fromValue(`value`: String): PurgeGuildAssetResultSchemaAssetType? = mapping[value]
  }
}
