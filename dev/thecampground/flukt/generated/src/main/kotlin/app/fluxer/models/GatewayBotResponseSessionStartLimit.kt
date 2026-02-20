package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Int

/**
 * Session start rate limit information
 */
public data class GatewayBotResponseSessionStartLimit(
  /**
   * Total number of session starts allowed
   */
  @param:JsonProperty(
    "total",
    required = true,
  )
  @get:JsonProperty("total")
  @get:NotNull
  public val total: Int,
  /**
   * Remaining number of session starts
   */
  @param:JsonProperty(
    "remaining",
    required = true,
  )
  @get:JsonProperty("remaining")
  @get:NotNull
  public val remaining: Int,
  /**
   * Milliseconds until the limit resets
   */
  @param:JsonProperty(
    "reset_after",
    required = true,
  )
  @get:JsonProperty("reset_after")
  @get:NotNull
  public val resetAfter: Int,
  /**
   * Maximum number of concurrent IDENTIFY requests
   */
  @param:JsonProperty(
    "max_concurrency",
    required = true,
  )
  @get:JsonProperty("max_concurrency")
  @get:NotNull
  public val maxConcurrency: Int,
)
