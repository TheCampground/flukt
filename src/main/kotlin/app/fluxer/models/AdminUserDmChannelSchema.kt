package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class AdminUserDmChannelSchema(
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String,
  @param:JsonProperty(
    "channel_type",
    required = true,
  )
  @get:JsonProperty("channel_type")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val channelType: Int,
  @param:JsonProperty("recipient_ids")
  @get:JsonProperty("recipient_ids")
  @get:NotNull
  @get:Size(max = 100)
  public val recipientIds: List<String>,
  @param:JsonProperty("last_message_id")
  @get:JsonProperty("last_message_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val lastMessageId: String,
  @param:JsonProperty(
    "is_open",
    required = true,
  )
  @get:JsonProperty("is_open")
  @get:NotNull
  public val isOpen: Boolean,
)
