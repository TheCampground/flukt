package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Sort order
 */
public enum class GuildMemberSearchRequestSortOrder(
  @JsonValue
  public val `value`: String,
) {
  ASC("asc"),
  DESC("desc"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, GuildMemberSearchRequestSortOrder> =
        entries.associateBy(GuildMemberSearchRequestSortOrder::value)

    public fun fromValue(`value`: String): GuildMemberSearchRequestSortOrder? = mapping[value]
  }
}
