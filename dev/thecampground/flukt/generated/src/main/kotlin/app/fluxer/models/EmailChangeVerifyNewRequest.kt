package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class EmailChangeVerifyNewRequest(
  /**
   * Email change ticket identifier
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
  /**
   * Verification code sent to the original email address
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  /**
   * Proof token obtained from verifying the original email
   */
  @param:JsonProperty("original_proof")
  @get:JsonProperty("original_proof")
  @get:NotNull
  public val originalProof: String,
)
