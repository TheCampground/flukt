package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class UserSessionResponse(
  /**
   * Hashed session identifier (base64url)
   */
  @param:JsonProperty("session_id_hash")
  @get:JsonProperty("session_id_hash")
  @get:NotNull
  public val sessionIdHash: String,
  /**
   * ISO timestamp when the session was created
   */
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: String,
  /**
   * ISO timestamp of the session last usage (approximate)
   */
  @param:JsonProperty("approx_last_used_at")
  @get:JsonProperty("approx_last_used_at")
  @get:NotNull
  public val approxLastUsedAt: String,
  /**
   * Client IP address
   */
  @param:JsonProperty("client_ip")
  @get:JsonProperty("client_ip")
  @get:NotNull
  public val clientIp: String,
  @param:JsonProperty("client_ip_reverse")
  @get:JsonProperty("client_ip_reverse")
  public val clientIpReverse: String?,
  @param:JsonProperty("client_os")
  @get:JsonProperty("client_os")
  public val clientOs: String?,
  @param:JsonProperty("client_platform")
  @get:JsonProperty("client_platform")
  public val clientPlatform: String?,
  @param:JsonProperty("client_location")
  @get:JsonProperty("client_location")
  public val clientLocation: String?,
)
