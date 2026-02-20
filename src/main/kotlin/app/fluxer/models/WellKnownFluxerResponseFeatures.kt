package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean

/**
 * Feature flags for this instance
 */
public data class WellKnownFluxerResponseFeatures(
  /**
   * Whether SMS-based MFA is available
   */
  @param:JsonProperty(
    "sms_mfa_enabled",
    required = true,
  )
  @get:JsonProperty("sms_mfa_enabled")
  @get:NotNull
  public val smsMfaEnabled: Boolean,
  /**
   * Whether voice/video calling is enabled
   */
  @param:JsonProperty(
    "voice_enabled",
    required = true,
  )
  @get:JsonProperty("voice_enabled")
  @get:NotNull
  public val voiceEnabled: Boolean,
  /**
   * Whether Stripe payments are enabled
   */
  @param:JsonProperty(
    "stripe_enabled",
    required = true,
  )
  @get:JsonProperty("stripe_enabled")
  @get:NotNull
  public val stripeEnabled: Boolean,
  /**
   * Whether this is a self-hosted instance
   */
  @param:JsonProperty(
    "self_hosted",
    required = true,
  )
  @get:JsonProperty("self_hosted")
  @get:NotNull
  public val selfHosted: Boolean,
  /**
   * Whether manual review mode is enabled for registrations
   */
  @param:JsonProperty(
    "manual_review_enabled",
    required = true,
  )
  @get:JsonProperty("manual_review_enabled")
  @get:NotNull
  public val manualReviewEnabled: Boolean,
)
