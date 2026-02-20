package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Sort results by field
 */
public enum class GuildMemberSearchRequestSortBy(
  @JsonValue
  public val `value`: String,
) {
  JOINED_AT("joinedAt"),
  RELEVANCE("relevance"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, GuildMemberSearchRequestSortBy> =
        entries.associateBy(GuildMemberSearchRequestSortBy::value)

    public fun fromValue(`value`: String): GuildMemberSearchRequestSortBy? = mapping[value]
  }
}
