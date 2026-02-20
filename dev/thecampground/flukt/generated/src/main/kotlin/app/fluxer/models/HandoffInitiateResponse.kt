package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import java.time.OffsetDateTime
import kotlin.String

public data class HandoffInitiateResponse(
  /**
   * Handoff code to share with the receiving device
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  /**
   * ISO 8601 timestamp when the handoff code expires
   */
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  @get:NotNull
  public val expiresAt: OffsetDateTime,
)
