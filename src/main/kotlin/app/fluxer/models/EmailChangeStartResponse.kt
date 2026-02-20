package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.String

public data class EmailChangeStartResponse(
  /**
   * Ticket returned for email change actions
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
  /**
   * Whether verification of the original email is required
   */
  @param:JsonProperty(
    "require_original",
    required = true,
  )
  @get:JsonProperty("require_original")
  @get:NotNull
  public val requireOriginal: Boolean,
  @param:JsonProperty("original_email")
  @get:JsonProperty("original_email")
  public val originalEmail: String?,
  @param:JsonProperty("original_proof")
  @get:JsonProperty("original_proof")
  public val originalProof: String?,
  @param:JsonProperty("original_code_expires_at")
  @get:JsonProperty("original_code_expires_at")
  public val originalCodeExpiresAt: String?,
  @param:JsonProperty("resend_available_at")
  @get:JsonProperty("resend_available_at")
  public val resendAvailableAt: String?,
)
