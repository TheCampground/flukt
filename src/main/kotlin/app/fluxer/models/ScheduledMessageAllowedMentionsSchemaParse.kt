package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Types of mentions to parse from content
 */
public enum class ScheduledMessageAllowedMentionsSchemaParse(
  @JsonValue
  public val `value`: String,
) {
  USERS("users"),
  ROLES("roles"),
  EVERYONE("everyone"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, ScheduledMessageAllowedMentionsSchemaParse> =
        entries.associateBy(ScheduledMessageAllowedMentionsSchemaParse::value)

    public fun fromValue(`value`: String): ScheduledMessageAllowedMentionsSchemaParse? =
        mapping[value]
  }
}
