package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Search scope for message searches
 */
public enum class MessageSearchScope(
  @JsonValue
  public val `value`: String,
) {
  CURRENT("current"),
  OPEN_DMS("open_dms"),
  ALL_DMS("all_dms"),
  ALL_GUILDS("all_guilds"),
  ALL("all"),
  OPEN_DMS_AND_ALL_GUILDS("open_dms_and_all_guilds"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MessageSearchScope> =
        entries.associateBy(MessageSearchScope::value)

    public fun fromValue(`value`: String): MessageSearchScope? = mapping[value]
  }
}
