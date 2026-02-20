package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class EmailChangeRequestNewRequest(
  /**
   * Email change ticket identifier
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
  @param:JsonProperty("new_email")
  @get:JsonProperty("new_email")
  @get:NotNull
  public val newEmail: String,
  /**
   * Proof token obtained from verifying the original email
   */
  @param:JsonProperty("original_proof")
  @get:JsonProperty("original_proof")
  @get:NotNull
  public val originalProof: String,
)
