package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public data class WebAuthnMfaRequest(
  /**
   * WebAuthn authentication response
   */
  @param:JsonProperty("response")
  @get:JsonProperty("response")
  @get:NotNull
  public val response: Map<String, Any?>,
  /**
   * The challenge string from authentication options
   */
  @param:JsonProperty("challenge")
  @get:JsonProperty("challenge")
  @get:NotNull
  public val challenge: String,
  /**
   * The MFA ticket from the login response
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
)
