package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

/**
 * Public key for E2E encryption
 */
public data class WellKnownFluxerResponsePublicKey(
  /**
   * Key identifier
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  /**
   * Key algorithm
   */
  @param:JsonProperty("algorithm")
  @get:JsonProperty("algorithm")
  @get:NotNull
  public val algorithm: PublicKeyAlgorithm,
  /**
   * Base64-encoded public key
   */
  @param:JsonProperty("public_key_base64")
  @get:JsonProperty("public_key_base64")
  @get:NotNull
  public val publicKeyBase64: String,
)
