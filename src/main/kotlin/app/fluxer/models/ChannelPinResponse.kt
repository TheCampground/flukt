package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.time.OffsetDateTime

public data class ChannelPinResponse(
  /**
   * The pinned message
   */
  @param:JsonProperty("message")
  @get:JsonProperty("message")
  @get:NotNull
  @get:Valid
  public val message: ChannelPinMessageResponse,
  /**
   * The ISO 8601 timestamp of when the message was pinned
   */
  @param:JsonProperty("pinned_at")
  @get:JsonProperty("pinned_at")
  @get:NotNull
  public val pinnedAt: OffsetDateTime,
)
