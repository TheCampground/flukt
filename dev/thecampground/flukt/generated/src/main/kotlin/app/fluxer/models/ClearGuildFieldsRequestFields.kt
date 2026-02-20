package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Guild image field that can be cleared
 */
public enum class ClearGuildFieldsRequestFields(
  @JsonValue
  public val `value`: String,
) {
  ICON("icon"),
  BANNER("banner"),
  SPLASH("splash"),
  EMBED_SPLASH("embed_splash"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, ClearGuildFieldsRequestFields> =
        entries.associateBy(ClearGuildFieldsRequestFields::value)

    public fun fromValue(`value`: String): ClearGuildFieldsRequestFields? = mapping[value]
  }
}
