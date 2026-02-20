package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * User profile field that can be cleared
 */
public enum class ClearUserFieldsRequestFields(
  @JsonValue
  public val `value`: String,
) {
  AVATAR("avatar"),
  BANNER("banner"),
  BIO("bio"),
  PRONOUNS("pronouns"),
  GLOBAL_NAME("global_name"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, ClearUserFieldsRequestFields> =
        entries.associateBy(ClearUserFieldsRequestFields::value)

    public fun fromValue(`value`: String): ClearUserFieldsRequestFields? = mapping[value]
  }
}
