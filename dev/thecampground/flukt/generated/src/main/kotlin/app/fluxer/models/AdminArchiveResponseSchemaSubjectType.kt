package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Type of subject being archived
 */
public enum class AdminArchiveResponseSchemaSubjectType(
  @JsonValue
  public val `value`: String,
) {
  USER("user"),
  GUILD("guild"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, AdminArchiveResponseSchemaSubjectType> =
        entries.associateBy(AdminArchiveResponseSchemaSubjectType::value)

    public fun fromValue(`value`: String): AdminArchiveResponseSchemaSubjectType? = mapping[value]
  }
}
