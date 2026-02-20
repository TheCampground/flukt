package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Any
import kotlin.String
import kotlin.collections.Map

public data class EnableMfaTotpRequest(
  /**
   * The TOTP secret key
   */
  @param:JsonProperty("secret")
  @get:JsonProperty("secret")
  @get:NotNull
  public val secret: String,
  /**
   * The TOTP verification code
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  @param:JsonProperty("password")
  @get:JsonProperty("password")
  @get:Size(
    min = 8,
    max = 256,
  )
  public val password: String? = null,
  /**
   * MFA method to use for verification
   */
  @param:JsonProperty("mfa_method")
  @get:JsonProperty("mfa_method")
  public val mfaMethod: EnableMfaTotpRequestMfaMethod? = null,
  /**
   * MFA verification code from authenticator app or SMS
   */
  @param:JsonProperty("mfa_code")
  @get:JsonProperty("mfa_code")
  public val mfaCode: String? = null,
  /**
   * WebAuthn authentication response
   */
  @param:JsonProperty("webauthn_response")
  @get:JsonProperty("webauthn_response")
  public val webauthnResponse: Map<String, Any?>? = null,
  /**
   * WebAuthn challenge string
   */
  @param:JsonProperty("webauthn_challenge")
  @get:JsonProperty("webauthn_challenge")
  public val webauthnChallenge: String? = null,
)
