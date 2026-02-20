package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * MFA method to use for verification
 */
public enum class UserUpdateWithVerificationRequestMfaMethod(
  @JsonValue
  public val `value`: String,
) {
  TOTP("totp"),
  SMS("sms"),
  WEBAUTHN("webauthn"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, UserUpdateWithVerificationRequestMfaMethod> =
        entries.associateBy(UserUpdateWithVerificationRequestMfaMethod::value)

    public fun fromValue(`value`: String): UserUpdateWithVerificationRequestMfaMethod? =
        mapping[value]
  }
}
