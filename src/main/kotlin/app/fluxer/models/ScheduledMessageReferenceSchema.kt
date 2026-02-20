package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class ScheduledMessageReferenceSchema(
  /**
   * ID of the message being referenced
   */
  @param:JsonProperty("message_id")
  @get:JsonProperty("message_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val messageId: String,
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String? = null,
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String? = null,
  /**
   * The type of message reference
   */
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  public val type: Int? = null,
)
