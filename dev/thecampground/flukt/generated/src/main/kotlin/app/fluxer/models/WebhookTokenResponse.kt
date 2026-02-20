package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class WebhookTokenResponse(
  /**
   * The unique identifier (snowflake) for the webhook
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The ID of the guild this webhook belongs to
   */
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  /**
   * The ID of the channel this webhook posts to
   */
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String,
  /**
   * The display name of the webhook
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: String? = null,
  /**
   * The secure token used to execute the webhook
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  @get:NotNull
  public val token: String,
)
