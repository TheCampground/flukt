package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * Type of search index to refresh
 */
public enum class RefreshSearchIndexRequestIndexType(
  @JsonValue
  public val `value`: String,
) {
  GUILDS("guilds"),
  USERS("users"),
  REPORTS("reports"),
  AUDIT_LOGS("audit_logs"),
  CHANNEL_MESSAGES("channel_messages"),
  GUILD_MEMBERS("guild_members"),
  FAVORITE_MEMES("favorite_memes"),
  DISCOVERY("discovery"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, RefreshSearchIndexRequestIndexType> =
        entries.associateBy(RefreshSearchIndexRequestIndexType::value)

    public fun fromValue(`value`: String): RefreshSearchIndexRequestIndexType? = mapping[value]
  }
}
