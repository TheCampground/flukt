package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.collections.List

public data class ChannelPinsResponse(
  /**
   * Pinned messages in this channel
   */
  @param:JsonProperty("items")
  @get:JsonProperty("items")
  @get:NotNull
  @get:Valid
  public val items: List<ChannelPinResponse>,
  /**
   * Whether more pins can be fetched with pagination
   */
  @param:JsonProperty(
    "has_more",
    required = true,
  )
  @get:JsonProperty("has_more")
  @get:NotNull
  public val hasMore: Boolean,
)
