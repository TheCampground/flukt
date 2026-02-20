package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * UI theme preference
 */
public enum class UserThemeType(
  @JsonValue
  public val `value`: String,
) {
  DARK("dark"),
  COAL("coal"),
  LIGHT("light"),
  SYSTEM("system"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, UserThemeType> = entries.associateBy(UserThemeType::value)

    public fun fromValue(`value`: String): UserThemeType? = mapping[value]
  }
}
