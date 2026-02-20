package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class EmailChangeRequestNewResponse(
  /**
   * Ticket associated with the email change attempt
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
  /**
   * The new email address the user wants to verify
   */
  @param:JsonProperty("new_email")
  @get:JsonProperty("new_email")
  @get:NotNull
  public val newEmail: String,
  /**
   * ISO8601 timestamp when the new email code expires
   */
  @param:JsonProperty("new_code_expires_at")
  @get:JsonProperty("new_code_expires_at")
  @get:NotNull
  public val newCodeExpiresAt: String,
  @param:JsonProperty("resend_available_at")
  @get:JsonProperty("resend_available_at")
  public val resendAvailableAt: String?,
)
