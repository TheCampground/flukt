package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Size
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class UserSettingsUpdateRequest(
  /**
   * Friend source flags
   */
  @param:JsonProperty("flags")
  @get:JsonProperty("flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val flags: Int? = null,
  /**
   * User online status
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  public val status: UserStatusType? = null,
  /**
   * When status resets
   */
  @param:JsonProperty("status_resets_at")
  @get:JsonProperty("status_resets_at")
  public val statusResetsAt: Any? = null,
  /**
   * User online status
   */
  @param:JsonProperty("status_resets_to")
  @get:JsonProperty("status_resets_to")
  public val statusResetsTo: UserStatusType? = null,
  /**
   * UI theme preference
   */
  @param:JsonProperty("theme")
  @get:JsonProperty("theme")
  public val theme: UserThemeType? = null,
  /**
   * The locale code for the user interface language
   */
  @param:JsonProperty("locale")
  @get:JsonProperty("locale")
  public val locale: Locale? = null,
  /**
   * Guilds with DM restrictions
   */
  @param:JsonProperty("restricted_guilds")
  @get:JsonProperty("restricted_guilds")
  @get:Size(max = 200)
  public val restrictedGuilds: List<String>? = null,
  /**
   * Guilds with bot DM restrictions
   */
  @param:JsonProperty("bot_restricted_guilds")
  @get:JsonProperty("bot_restricted_guilds")
  @get:Size(max = 200)
  public val botRestrictedGuilds: List<String>? = null,
  /**
   * Default DM restriction for new guilds
   */
  @param:JsonProperty("default_guilds_restricted")
  @get:JsonProperty("default_guilds_restricted")
  public val defaultGuildsRestricted: Boolean? = null,
  /**
   * Default bot DM restriction for new guilds
   */
  @param:JsonProperty("bot_default_guilds_restricted")
  @get:JsonProperty("bot_default_guilds_restricted")
  public val botDefaultGuildsRestricted: Boolean? = null,
  /**
   * Display attachments inline
   */
  @param:JsonProperty("inline_attachment_media")
  @get:JsonProperty("inline_attachment_media")
  public val inlineAttachmentMedia: Boolean? = null,
  /**
   * Display embed media inline
   */
  @param:JsonProperty("inline_embed_media")
  @get:JsonProperty("inline_embed_media")
  public val inlineEmbedMedia: Boolean? = null,
  /**
   * Auto-play GIFs
   */
  @param:JsonProperty("gif_auto_play")
  @get:JsonProperty("gif_auto_play")
  public val gifAutoPlay: Boolean? = null,
  /**
   * Render message embeds
   */
  @param:JsonProperty("render_embeds")
  @get:JsonProperty("render_embeds")
  public val renderEmbeds: Boolean? = null,
  /**
   * Display reactions
   */
  @param:JsonProperty("render_reactions")
  @get:JsonProperty("render_reactions")
  public val renderReactions: Boolean? = null,
  /**
   * Animate custom emoji
   */
  @param:JsonProperty("animate_emoji")
  @get:JsonProperty("animate_emoji")
  public val animateEmoji: Boolean? = null,
  /**
   * Sticker animation preference
   */
  @param:JsonProperty("animate_stickers")
  @get:JsonProperty("animate_stickers")
  public val animateStickers: Int? = null,
  /**
   * Spoiler rendering preference
   */
  @param:JsonProperty("render_spoilers")
  @get:JsonProperty("render_spoilers")
  public val renderSpoilers: Int? = null,
  /**
   * Compact message display
   */
  @param:JsonProperty("message_display_compact")
  @get:JsonProperty("message_display_compact")
  public val messageDisplayCompact: Boolean? = null,
  /**
   * Friend source flags
   */
  @param:JsonProperty("friend_source_flags")
  @get:JsonProperty("friend_source_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val friendSourceFlags: Int? = null,
  /**
   * Incoming call settings
   */
  @param:JsonProperty("incoming_call_flags")
  @get:JsonProperty("incoming_call_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val incomingCallFlags: Int? = null,
  /**
   * Group DM add permissions
   */
  @param:JsonProperty("group_dm_add_permission_flags")
  @get:JsonProperty("group_dm_add_permission_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val groupDmAddPermissionFlags: Int? = null,
  /**
   * Guild folder organization
   */
  @param:JsonProperty("guild_folders")
  @get:JsonProperty("guild_folders")
  @get:Size(max = 200)
  @get:Valid
  public val guildFolders: List<UserSettingsUpdateRequestGuildFolders>? = null,
  @param:JsonProperty("custom_status")
  @get:JsonProperty("custom_status")
  @get:Valid
  public val customStatus: CustomStatusPayload? = null,
  /**
   * AFK timeout in seconds
   */
  @param:JsonProperty("afk_timeout")
  @get:JsonProperty("afk_timeout")
  public val afkTimeout: Int? = null,
  /**
   * Time format preference
   */
  @param:JsonProperty("time_format")
  @get:JsonProperty("time_format")
  public val timeFormat: Int? = null,
  /**
   * Developer mode enabled
   */
  @param:JsonProperty("developer_mode")
  @get:JsonProperty("developer_mode")
  public val developerMode: Boolean? = null,
  /**
   * Trusted external link domains. Use "*" to trust all domains.
   */
  @param:JsonProperty("trusted_domains")
  @get:JsonProperty("trusted_domains")
  @get:Size(max = 1_000)
  public val trustedDomains: List<String>? = null,
  /**
   * Hide muted channels by default in new guilds
   */
  @param:JsonProperty("default_hide_muted_channels")
  @get:JsonProperty("default_hide_muted_channels")
  public val defaultHideMutedChannels: Boolean? = null,
)
