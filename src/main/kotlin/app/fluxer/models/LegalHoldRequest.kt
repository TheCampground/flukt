package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.String

public data class LegalHoldRequest(
  /**
   * ISO 8601 timestamp when the legal hold expires
   */
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: String? = null,
)
