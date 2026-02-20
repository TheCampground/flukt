package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonValue
import kotlin.String
import kotlin.collections.Map

/**
 * MFA method to use for verification
 */
public enum class PhoneAddRequestMfaMethod(
  @JsonValue
  public val `value`: String,
) {
  TOTP("totp"),
  SMS("sms"),
  WEBAUTHN("webauthn"),
  ;

  override fun toString(): String = value

  public companion object {
    private val mapping: Map<String, PhoneAddRequestMfaMethod> =
        entries.associateBy(PhoneAddRequestMfaMethod::value)

    public fun fromValue(`value`: String): PhoneAddRequestMfaMethod? = mapping[value]
  }
}
