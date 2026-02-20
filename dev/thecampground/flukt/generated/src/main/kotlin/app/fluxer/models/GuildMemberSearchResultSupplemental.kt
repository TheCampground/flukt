package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Int
import kotlin.String

/**
 * Supplemental members-search-only metadata that is not part of the base guild member payload
 */
public data class GuildMemberSearchResultSupplemental(
  /**
   * How the member joined the guild
   */
  @param:JsonProperty("join_source_type")
  @get:JsonProperty("join_source_type")
  public val joinSourceType: Int? = null,
  @param:JsonProperty("source_invite_code")
  @get:JsonProperty("source_invite_code")
  public val sourceInviteCode: String?,
  @param:JsonProperty("inviter_id")
  @get:JsonProperty("inviter_id")
  public val inviterId: String?,
)
