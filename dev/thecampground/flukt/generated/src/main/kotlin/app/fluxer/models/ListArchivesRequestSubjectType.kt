package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Type of archives to list
 */
public enum class ListArchivesRequestSubjectType(
  @JsonValue
  public val `value`: String,
) {
  USER("user"),
  GUILD("guild"),
  ALL("all"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, ListArchivesRequestSubjectType> =
        entries.associateBy(ListArchivesRequestSubjectType::value)

    public fun fromValue(`value`: String): ListArchivesRequestSubjectType? = mapping[value]
  }
}
