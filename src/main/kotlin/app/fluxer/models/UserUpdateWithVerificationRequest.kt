package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Any
import kotlin.Boolean
import kotlin.ByteArray
import kotlin.Int
import kotlin.String
import kotlin.collections.Map

public data class UserUpdateWithVerificationRequest(
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:Pattern(regexp = "^[a-zA-Z0-9_]+${'$'}")
  @get:Size(
    min = 1,
    max = 32,
  )
  public val username: String? = null,
  /**
   * The 4-digit discriminator tag
   */
  @param:JsonProperty("discriminator")
  @get:JsonProperty("discriminator")
  @get:Pattern(regexp = "^\\d{1,4}${'$'}")
  public val discriminator: String? = null,
  @param:JsonProperty("global_name")
  @get:JsonProperty("global_name")
  public val globalName: String? = null,
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  public val email: String? = null,
  @param:JsonProperty("new_password")
  @get:JsonProperty("new_password")
  @get:Size(
    min = 8,
    max = 256,
  )
  public val newPassword: String? = null,
  @param:JsonProperty("password")
  @get:JsonProperty("password")
  @get:Size(
    min = 8,
    max = 256,
  )
  public val password: String? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: ByteArray? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: ByteArray? = null,
  @param:JsonProperty("bio")
  @get:JsonProperty("bio")
  public val bio: String? = null,
  @param:JsonProperty("pronouns")
  @get:JsonProperty("pronouns")
  public val pronouns: String? = null,
  @param:JsonProperty("accent_color")
  @get:JsonProperty("accent_color")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "16777215",
    inclusive = true,
  )
  public val accentColor: Int? = null,
  /**
   * Whether to hide the premium badge
   */
  @param:JsonProperty("premium_badge_hidden")
  @get:JsonProperty("premium_badge_hidden")
  public val premiumBadgeHidden: Boolean? = null,
  /**
   * Whether to mask the premium badge
   */
  @param:JsonProperty("premium_badge_masked")
  @get:JsonProperty("premium_badge_masked")
  public val premiumBadgeMasked: Boolean? = null,
  /**
   * Whether to hide premium badge timestamp
   */
  @param:JsonProperty("premium_badge_timestamp_hidden")
  @get:JsonProperty("premium_badge_timestamp_hidden")
  public val premiumBadgeTimestampHidden: Boolean? = null,
  /**
   * Whether to hide premium badge sequence
   */
  @param:JsonProperty("premium_badge_sequence_hidden")
  @get:JsonProperty("premium_badge_sequence_hidden")
  public val premiumBadgeSequenceHidden: Boolean? = null,
  /**
   * Override premium enabled state
   */
  @param:JsonProperty("premium_enabled_override")
  @get:JsonProperty("premium_enabled_override")
  public val premiumEnabledOverride: Boolean? = null,
  /**
   * Whether user dismissed premium onboarding
   */
  @param:JsonProperty("has_dismissed_premium_onboarding")
  @get:JsonProperty("has_dismissed_premium_onboarding")
  public val hasDismissedPremiumOnboarding: Boolean? = null,
  /**
   * Whether user has unread gifts
   */
  @param:JsonProperty("has_unread_gift_inventory")
  @get:JsonProperty("has_unread_gift_inventory")
  public val hasUnreadGiftInventory: Boolean? = null,
  /**
   * Whether user has used mobile client
   */
  @param:JsonProperty("used_mobile_client")
  @get:JsonProperty("used_mobile_client")
  public val usedMobileClient: Boolean? = null,
  /**
   * Email change token for updating email
   */
  @param:JsonProperty("email_token")
  @get:JsonProperty("email_token")
  public val emailToken: String? = null,
  /**
   * MFA method to use for verification
   */
  @param:JsonProperty("mfa_method")
  @get:JsonProperty("mfa_method")
  public val mfaMethod: UserUpdateWithVerificationRequestMfaMethod? = null,
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
