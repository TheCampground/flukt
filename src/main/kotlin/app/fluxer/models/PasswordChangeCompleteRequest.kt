package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String

public data class PasswordChangeCompleteRequest(
  /**
   * Password change ticket identifier
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
  /**
   * Proof token obtained from verifying the email code
   */
  @param:JsonProperty("verification_proof")
  @get:JsonProperty("verification_proof")
  @get:NotNull
  public val verificationProof: String,
  @param:JsonProperty("new_password")
  @get:JsonProperty("new_password")
  @get:NotNull
  @get:Size(
    min = 8,
    max = 256,
  )
  public val newPassword: String,
)
