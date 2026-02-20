package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class SavedMessageEntryResponse(
  /**
   * Unique identifier for the saved message entry
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * ID of the channel containing the message
   */
  @param:JsonProperty("channel_id")
  @get:JsonProperty("channel_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val channelId: String,
  /**
   * ID of the saved message
   */
  @param:JsonProperty("message_id")
  @get:JsonProperty("message_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val messageId: String,
  /**
   * Availability status of the saved message
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: SavedMessageEntryResponseStatus,
  @param:JsonProperty("message")
  @get:JsonProperty("message")
  @get:Valid
  public val message: MessageResponseSchema?,
)
