package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

/**
 * Captcha configuration
 */
public data class WellKnownFluxerResponseCaptcha(
  /**
   * Captcha provider name (hcaptcha, turnstile, none)
   */
  @param:JsonProperty("provider")
  @get:JsonProperty("provider")
  @get:NotNull
  public val provider: String,
  @param:JsonProperty("hcaptcha_site_key")
  @get:JsonProperty("hcaptcha_site_key")
  public val hcaptchaSiteKey: String?,
  @param:JsonProperty("turnstile_site_key")
  @get:JsonProperty("turnstile_site_key")
  public val turnstileSiteKey: String?,
)
