package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class PushSubscribeRequest(
  /**
   * The push subscription endpoint URL
   */
  @param:JsonProperty("endpoint")
  @get:JsonProperty("endpoint")
  @get:NotNull
  public val endpoint: String,
  @param:JsonProperty("keys")
  @get:JsonProperty("keys")
  @get:NotNull
  @get:Valid
  public val keys: PushSubscribeRequestKeys,
  /**
   * The user agent string
   */
  @param:JsonProperty("user_agent")
  @get:JsonProperty("user_agent")
  public val userAgent: String? = null,
)
