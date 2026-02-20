package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * MFA method to use for verification
 */
public enum class MfaBackupCodesRequestMfaMethod(
  @JsonValue
  public val `value`: String,
) {
  TOTP("totp"),
  SMS("sms"),
  WEBAUTHN("webauthn"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, MfaBackupCodesRequestMfaMethod> =
        entries.associateBy(MfaBackupCodesRequestMfaMethod::value)

    public fun fromValue(`value`: String): MfaBackupCodesRequestMfaMethod? = mapping[value]
  }
}
