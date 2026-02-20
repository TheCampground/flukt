package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class UserSettingsResponse(
  /**
   * The current online status of the user
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: String,
  @param:JsonProperty("status_resets_at")
  @get:JsonProperty("status_resets_at")
  public val statusResetsAt: OffsetDateTime? = null,
  @param:JsonProperty("status_resets_to")
  @get:JsonProperty("status_resets_to")
  public val statusResetsTo: String? = null,
  /**
   * The UI theme preference
   */
  @param:JsonProperty("theme")
  @get:JsonProperty("theme")
  @get:NotNull
  public val theme: String,
  /**
   * The locale code for the user interface language
   */
  @param:JsonProperty("locale")
  @get:JsonProperty("locale")
  @get:NotNull
  public val locale: Locale,
  /**
   * Guild IDs where direct messages are restricted
   */
  @param:JsonProperty("restricted_guilds")
  @get:JsonProperty("restricted_guilds")
  @get:NotNull
  @get:Size(max = 200)
  public val restrictedGuilds: List<String>,
  /**
   * Guild IDs where bot direct messages are restricted
   */
  @param:JsonProperty("bot_restricted_guilds")
  @get:JsonProperty("bot_restricted_guilds")
  @get:NotNull
  @get:Size(max = 200)
  public val botRestrictedGuilds: List<String>,
  /**
   * Whether new guilds have DM restrictions by default
   */
  @param:JsonProperty(
    "default_guilds_restricted",
    required = true,
  )
  @get:JsonProperty("default_guilds_restricted")
  @get:NotNull
  public val defaultGuildsRestricted: Boolean,
  /**
   * Whether new guilds have bot DM restrictions by default
   */
  @param:JsonProperty(
    "bot_default_guilds_restricted",
    required = true,
  )
  @get:JsonProperty("bot_default_guilds_restricted")
  @get:NotNull
  public val botDefaultGuildsRestricted: Boolean,
  /**
   * Whether to display attachments inline in chat
   */
  @param:JsonProperty(
    "inline_attachment_media",
    required = true,
  )
  @get:JsonProperty("inline_attachment_media")
  @get:NotNull
  public val inlineAttachmentMedia: Boolean,
  /**
   * Whether to display embed media inline in chat
   */
  @param:JsonProperty(
    "inline_embed_media",
    required = true,
  )
  @get:JsonProperty("inline_embed_media")
  @get:NotNull
  public val inlineEmbedMedia: Boolean,
  /**
   * Whether GIFs auto-play in chat
   */
  @param:JsonProperty(
    "gif_auto_play",
    required = true,
  )
  @get:JsonProperty("gif_auto_play")
  @get:NotNull
  public val gifAutoPlay: Boolean,
  /**
   * Whether to render message embeds
   */
  @param:JsonProperty(
    "render_embeds",
    required = true,
  )
  @get:JsonProperty("render_embeds")
  @get:NotNull
  public val renderEmbeds: Boolean,
  /**
   * Whether to display reactions on messages
   */
  @param:JsonProperty(
    "render_reactions",
    required = true,
  )
  @get:JsonProperty("render_reactions")
  @get:NotNull
  public val renderReactions: Boolean,
  /**
   * Whether to animate custom emoji
   */
  @param:JsonProperty(
    "animate_emoji",
    required = true,
  )
  @get:JsonProperty("animate_emoji")
  @get:NotNull
  public val animateEmoji: Boolean,
  /**
   * Sticker animation preference
   */
  @param:JsonProperty(
    "animate_stickers",
    required = true,
  )
  @get:JsonProperty("animate_stickers")
  @get:NotNull
  public val animateStickers: Int,
  /**
   * Spoiler rendering preference
   */
  @param:JsonProperty(
    "render_spoilers",
    required = true,
  )
  @get:JsonProperty("render_spoilers")
  @get:NotNull
  public val renderSpoilers: Int,
  /**
   * Whether to use compact message display mode
   */
  @param:JsonProperty(
    "message_display_compact",
    required = true,
  )
  @get:JsonProperty("message_display_compact")
  @get:NotNull
  public val messageDisplayCompact: Boolean,
  /**
   * Friend source flags
   */
  @param:JsonProperty(
    "friend_source_flags",
    required = true,
  )
  @get:JsonProperty("friend_source_flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val friendSourceFlags: Int,
  /**
   * Incoming call settings
   */
  @param:JsonProperty(
    "incoming_call_flags",
    required = true,
  )
  @get:JsonProperty("incoming_call_flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val incomingCallFlags: Int,
  /**
   * Group DM add permissions
   */
  @param:JsonProperty(
    "group_dm_add_permission_flags",
    required = true,
  )
  @get:JsonProperty("group_dm_add_permission_flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val groupDmAddPermissionFlags: Int,
  /**
   * The folder structure for organizing guilds in the sidebar
   */
  @param:JsonProperty("guild_folders")
  @get:JsonProperty("guild_folders")
  @get:NotNull
  @get:Size(max = 200)
  @get:Valid
  public val guildFolders: List<UserSettingsResponseGuildFolders>,
  @param:JsonProperty("custom_status")
  @get:JsonProperty("custom_status")
  @get:NotNull
  @get:Valid
  public val customStatus: CustomStatusResponse,
  /**
   * The idle timeout in seconds before going AFK
   */
  @param:JsonProperty(
    "afk_timeout",
    required = true,
  )
  @get:JsonProperty("afk_timeout")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val afkTimeout: Int,
  /**
   * Time format preference
   */
  @param:JsonProperty(
    "time_format",
    required = true,
  )
  @get:JsonProperty("time_format")
  @get:NotNull
  public val timeFormat: Int,
  /**
   * Whether developer mode is enabled
   */
  @param:JsonProperty(
    "developer_mode",
    required = true,
  )
  @get:JsonProperty("developer_mode")
  @get:NotNull
  public val developerMode: Boolean,
  /**
   * List of trusted external link domains
   */
  @param:JsonProperty("trusted_domains")
  @get:JsonProperty("trusted_domains")
  @get:NotNull
  @get:Size(max = 1_000)
  public val trustedDomains: List<String>,
  /**
   * Whether muted channels are hidden by default in new guilds
   */
  @param:JsonProperty(
    "default_hide_muted_channels",
    required = true,
  )
  @get:JsonProperty("default_hide_muted_channels")
  @get:NotNull
  public val defaultHideMutedChannels: Boolean,
)
