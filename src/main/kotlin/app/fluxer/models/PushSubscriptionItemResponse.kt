package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class PushSubscriptionItemResponse(
  /**
   * The unique identifier for the push subscription
   */
  @param:JsonProperty("subscription_id")
  @get:JsonProperty("subscription_id")
  @get:NotNull
  @get:Pattern(regexp = "^[a-f0-9]{32}${'$'}")
  public val subscriptionId: String,
  @param:JsonProperty("user_agent")
  @get:JsonProperty("user_agent")
  public val userAgent: String?,
)
