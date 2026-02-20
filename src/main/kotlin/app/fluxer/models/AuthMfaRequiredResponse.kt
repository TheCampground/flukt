package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class AuthMfaRequiredResponse(
  /**
   * Indicates MFA is required to complete authentication
   */
  @param:JsonProperty(
    "mfa",
    required = true,
  )
  @get:JsonProperty("mfa")
  @get:NotNull
  public val mfa: Boolean,
  /**
   * MFA ticket to use when completing MFA verification
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
  /**
   * List of allowed MFA methods
   */
  @param:JsonProperty("allowed_methods")
  @get:JsonProperty("allowed_methods")
  @get:NotNull
  @get:Size(max = 10)
  public val allowedMethods: List<String>,
  @param:JsonProperty("sms_phone_hint")
  @get:JsonProperty("sms_phone_hint")
  public val smsPhoneHint: String? = null,
  /**
   * Whether SMS MFA is available
   */
  @param:JsonProperty(
    "sms",
    required = true,
  )
  @get:JsonProperty("sms")
  @get:NotNull
  public val sms: Boolean,
  /**
   * Whether TOTP authenticator MFA is available
   */
  @param:JsonProperty(
    "totp",
    required = true,
  )
  @get:JsonProperty("totp")
  @get:NotNull
  public val totp: Boolean,
  /**
   * Whether WebAuthn security key MFA is available
   */
  @param:JsonProperty(
    "webauthn",
    required = true,
  )
  @get:JsonProperty("webauthn")
  @get:NotNull
  public val webauthn: Boolean,
)
