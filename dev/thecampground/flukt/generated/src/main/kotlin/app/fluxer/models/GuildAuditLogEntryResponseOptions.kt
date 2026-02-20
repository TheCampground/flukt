package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import java.math.BigDecimal
import kotlin.Boolean
import kotlin.String

/**
 * Additional options depending on action type
 */
public data class GuildAuditLogEntryResponseOptions(
  /**
   * Channel ID for relevant actions
   */
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  public val channelId: String? = null,
  /**
   * Count of items affected
   */
  @param:JsonProperty("count")
  @get:JsonProperty("count")
  public val count: BigDecimal? = null,
  /**
   * Number of days of messages to delete on member ban
   */
  @param:JsonProperty("delete_member_days")
  @get:JsonProperty("delete_member_days")
  public val deleteMemberDays: String? = null,
  /**
   * ID of the affected entity
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  public val id: String? = null,
  /**
   * Type of integration
   */
  @param:JsonProperty("integration_type")
  @get:JsonProperty("integration_type")
  public val integrationType: BigDecimal? = null,
  /**
   * Message ID for relevant actions
   */
  @param:JsonProperty("message_id")
  @get:JsonProperty("message_id")
  public val messageId: String? = null,
  /**
   * Number of members removed
   */
  @param:JsonProperty("members_removed")
  @get:JsonProperty("members_removed")
  public val membersRemoved: BigDecimal? = null,
  /**
   * Name of the role
   */
  @param:JsonProperty("role_name")
  @get:JsonProperty("role_name")
  public val roleName: String? = null,
  /**
   * Type identifier
   */
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  public val type: BigDecimal? = null,
  /**
   * ID of the user who created the invite
   */
  @param:JsonProperty("inviter_id")
  @get:JsonProperty("inviter_id")
  public val inviterId: String? = null,
  /**
   * Maximum age of the invite in seconds
   */
  @param:JsonProperty("max_age")
  @get:JsonProperty("max_age")
  public val maxAge: BigDecimal? = null,
  /**
   * Maximum number of uses for the invite
   */
  @param:JsonProperty("max_uses")
  @get:JsonProperty("max_uses")
  public val maxUses: BigDecimal? = null,
  /**
   * Whether the invite grants temporary membership
   */
  @param:JsonProperty("temporary")
  @get:JsonProperty("temporary")
  public val temporary: Boolean? = null,
  /**
   * Number of times the invite has been used
   */
  @param:JsonProperty("uses")
  @get:JsonProperty("uses")
  public val uses: BigDecimal? = null,
)
