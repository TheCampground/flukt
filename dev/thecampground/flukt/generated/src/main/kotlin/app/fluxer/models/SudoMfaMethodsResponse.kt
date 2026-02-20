package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

public data class SudoMfaMethodsResponse(
  /**
   * Whether TOTP is enabled
   */
  @param:JsonProperty(
    "totp",
    required = true,
  )
  @get:JsonProperty("totp")
  @get:NotNull
  public val totp: Boolean,
  /**
   * Whether SMS MFA is enabled
   */
  @param:JsonProperty(
    "sms",
    required = true,
  )
  @get:JsonProperty("sms")
  @get:NotNull
  public val sms: Boolean,
  /**
   * Whether WebAuthn is enabled
   */
  @param:JsonProperty(
    "webauthn",
    required = true,
  )
  @get:JsonProperty("webauthn")
  @get:NotNull
  public val webauthn: Boolean,
  /**
   * Whether any MFA method is enabled
   */
  @param:JsonProperty(
    "has_mfa",
    required = true,
  )
  @get:JsonProperty("has_mfa")
  @get:NotNull
  public val hasMfa: Boolean,
)
