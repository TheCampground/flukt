package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class UserPrivateResponsePendingBulkMessageDeletion(
  /**
   * ISO8601 timestamp of when the deletion was scheduled
   */
  @param:JsonProperty("scheduled_at")
  @get:JsonProperty("scheduled_at")
  @get:NotNull
  public val scheduledAt: String,
  /**
   * The number of channels with messages to delete
   */
  @param:JsonProperty(
    "channel_count",
    required = true,
  )
  @get:JsonProperty("channel_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val channelCount: Int,
  /**
   * The total number of messages to delete
   */
  @param:JsonProperty(
    "message_count",
    required = true,
  )
  @get:JsonProperty("message_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val messageCount: Int,
)
