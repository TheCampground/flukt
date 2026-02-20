package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class PasswordChangeStartResponse(
  /**
   * Ticket for password change actions
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
  /**
   * ISO8601 timestamp when the verification code expires
   */
  @param:JsonProperty("code_expires_at")
  @get:JsonProperty("code_expires_at")
  @get:NotNull
  public val codeExpiresAt: String,
  @param:JsonProperty("resend_available_at")
  @get:JsonProperty("resend_available_at")
  public val resendAvailableAt: String?,
)
