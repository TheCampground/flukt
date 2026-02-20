package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * User online status
 */
public enum class UserStatusType(
  @JsonValue
  public val `value`: String,
) {
  ONLINE("online"),
  DND("dnd"),
  IDLE("idle"),
  INVISIBLE("invisible"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, UserStatusType> = entries.associateBy(UserStatusType::value)

    public fun fromValue(`value`: String): UserStatusType? = mapping[value]
  }
}
