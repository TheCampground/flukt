package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class ReportAdminResponseSchema(
  @param:JsonProperty("report_id")
  @get:JsonProperty("report_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportId: String,
  @param:JsonProperty("reporter_id")
  @get:JsonProperty("reporter_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reporterId: String,
  @param:JsonProperty("reporter_tag")
  @get:JsonProperty("reporter_tag")
  public val reporterTag: String?,
  @param:JsonProperty("reporter_username")
  @get:JsonProperty("reporter_username")
  public val reporterUsername: String?,
  @param:JsonProperty("reporter_discriminator")
  @get:JsonProperty("reporter_discriminator")
  public val reporterDiscriminator: String?,
  @param:JsonProperty("reporter_email")
  @get:JsonProperty("reporter_email")
  public val reporterEmail: String?,
  @param:JsonProperty("reporter_full_legal_name")
  @get:JsonProperty("reporter_full_legal_name")
  public val reporterFullLegalName: String?,
  @param:JsonProperty("reporter_country_of_residence")
  @get:JsonProperty("reporter_country_of_residence")
  public val reporterCountryOfResidence: String?,
  @param:JsonProperty("reported_at")
  @get:JsonProperty("reported_at")
  @get:NotNull
  public val reportedAt: String,
  /**
   * The status of the report
   */
  @param:JsonProperty(
    "status",
    required = true,
  )
  @get:JsonProperty("status")
  @get:NotNull
  public val status: Int,
  /**
   * The type of entity being reported
   */
  @param:JsonProperty(
    "report_type",
    required = true,
  )
  @get:JsonProperty("report_type")
  @get:NotNull
  public val reportType: Int,
  @param:JsonProperty("category")
  @get:JsonProperty("category")
  public val category: String?,
  @param:JsonProperty("additional_info")
  @get:JsonProperty("additional_info")
  public val additionalInfo: String?,
  @param:JsonProperty("reported_user_id")
  @get:JsonProperty("reported_user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportedUserId: String,
  @param:JsonProperty("reported_user_tag")
  @get:JsonProperty("reported_user_tag")
  public val reportedUserTag: String?,
  @param:JsonProperty("reported_user_username")
  @get:JsonProperty("reported_user_username")
  public val reportedUserUsername: String?,
  @param:JsonProperty("reported_user_discriminator")
  @get:JsonProperty("reported_user_discriminator")
  public val reportedUserDiscriminator: String?,
  @param:JsonProperty("reported_user_avatar_hash")
  @get:JsonProperty("reported_user_avatar_hash")
  public val reportedUserAvatarHash: String?,
  @param:JsonProperty("reported_guild_id")
  @get:JsonProperty("reported_guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportedGuildId: String,
  @param:JsonProperty("reported_guild_name")
  @get:JsonProperty("reported_guild_name")
  public val reportedGuildName: String?,
  @param:JsonProperty("reported_message_id")
  @get:JsonProperty("reported_message_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportedMessageId: String,
  @param:JsonProperty("reported_channel_id")
  @get:JsonProperty("reported_channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportedChannelId: String,
  @param:JsonProperty("reported_channel_name")
  @get:JsonProperty("reported_channel_name")
  public val reportedChannelName: String?,
  @param:JsonProperty("reported_guild_invite_code")
  @get:JsonProperty("reported_guild_invite_code")
  public val reportedGuildInviteCode: String?,
  @param:JsonProperty("resolved_at")
  @get:JsonProperty("resolved_at")
  public val resolvedAt: String?,
  @param:JsonProperty("resolved_by_admin_id")
  @get:JsonProperty("resolved_by_admin_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val resolvedByAdminId: String,
  @param:JsonProperty("public_comment")
  @get:JsonProperty("public_comment")
  public val publicComment: String?,
  @param:JsonProperty("mutual_dm_channel_id")
  @get:JsonProperty("mutual_dm_channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val mutualDmChannelId: String? = null,
  @param:JsonProperty("message_context")
  @get:JsonProperty("message_context")
  @get:Valid
  public val messageContext: List<ReportAdminResponseSchemaMessageContext>? = null,
)
