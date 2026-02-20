package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class EmailChangeVerifyOriginalResponse(
  /**
   * Proof token issued after verifying the original email
   */
  @param:JsonProperty("original_proof")
  @get:JsonProperty("original_proof")
  @get:NotNull
  public val originalProof: String,
)
