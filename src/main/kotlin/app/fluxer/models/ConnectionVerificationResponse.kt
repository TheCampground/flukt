package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class ConnectionVerificationResponse(
  /**
   * The verification token to place in DNS or profile
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  @get:NotNull
  public val token: String,
  /**
   * The type of connection being verified
   */
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  @get:NotNull
  public val type: ConnectionVerificationResponseType,
  /**
   * The connection identifier (handle or domain)
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  /**
   * Human-readable instructions for completing verification
   */
  @param:JsonProperty("instructions")
  @get:JsonProperty("instructions")
  @get:NotNull
  public val instructions: String,
  /**
   * Signed token the client sends back at verify time
   */
  @param:JsonProperty("initiation_token")
  @get:JsonProperty("initiation_token")
  @get:NotNull
  public val initiationToken: String,
)
