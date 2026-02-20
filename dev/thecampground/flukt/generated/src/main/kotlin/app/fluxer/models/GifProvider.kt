package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * GIF provider used by the instance GIF picker
 */
public enum class GifProvider(
  @JsonValue
  public val `value`: String,
) {
  KLIPY("klipy"),
  TENOR("tenor"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, GifProvider> = entries.associateBy(GifProvider::value)

    public fun fromValue(`value`: String): GifProvider? = mapping[value]
  }
}
