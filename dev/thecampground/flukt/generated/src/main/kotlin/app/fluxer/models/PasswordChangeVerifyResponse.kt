package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class PasswordChangeVerifyResponse(
  /**
   * Proof token issued after verifying the email code
   */
  @param:JsonProperty("verification_proof")
  @get:JsonProperty("verification_proof")
  @get:NotNull
  public val verificationProof: String,
)
