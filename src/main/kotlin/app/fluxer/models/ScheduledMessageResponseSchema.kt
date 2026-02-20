package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class ScheduledMessageResponseSchema(
  /**
   * The unique identifier for this scheduled message
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The ID of the channel this message will be sent to
   */
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String,
  /**
   * The ISO 8601 UTC timestamp when the message is scheduled to be sent
   */
  @param:JsonProperty("scheduled_at")
  @get:JsonProperty("scheduled_at")
  @get:NotNull
  public val scheduledAt: String,
  /**
   * The ISO 8601 timestamp in the user local timezone
   */
  @param:JsonProperty("scheduled_local_at")
  @get:JsonProperty("scheduled_local_at")
  @get:NotNull
  public val scheduledLocalAt: String,
  /**
   * The IANA timezone identifier used for scheduling
   */
  @param:JsonProperty("timezone")
  @get:JsonProperty("timezone")
  @get:NotNull
  public val timezone: String,
  /**
   * The current status of the scheduled message
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: ScheduledMessageResponseSchemaStatus,
  @param:JsonProperty("status_reason")
  @get:JsonProperty("status_reason")
  public val statusReason: String?,
  /**
   * The message content and metadata to be sent
   */
  @param:JsonProperty("payload")
  @get:JsonProperty("payload")
  @get:NotNull
  @get:Valid
  public val payload: ScheduledMessageResponseSchemaPayload,
  /**
   * The ISO 8601 timestamp when this scheduled message was created
   */
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: String,
  @param:JsonProperty("invalidated_at")
  @get:JsonProperty("invalidated_at")
  public val invalidatedAt: String?,
)
