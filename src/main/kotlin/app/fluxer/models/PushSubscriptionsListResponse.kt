package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.collections.List

public data class PushSubscriptionsListResponse(
  /**
   * Array of push subscriptions
   */
  @param:JsonProperty("subscriptions")
  @get:JsonProperty("subscriptions")
  @get:NotNull
  @get:Valid
  public val subscriptions: List<PushSubscriptionItemResponse>,
)
