package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class GatewayBotResponse(
  /**
   * WebSocket URL to connect to the gateway
   */
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  @get:NotNull
  public val url: String,
  /**
   * Recommended number of shards to use when connecting
   */
  @param:JsonProperty(
    "shards",
    required = true,
  )
  @get:JsonProperty("shards")
  @get:NotNull
  public val shards: Int,
  /**
   * Session start rate limit information
   */
  @param:JsonProperty("session_start_limit")
  @get:JsonProperty("session_start_limit")
  @get:NotNull
  @get:Valid
  public val sessionStartLimit: GatewayBotResponseSessionStartLimit,
)
