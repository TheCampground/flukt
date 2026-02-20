package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class DeleteWebAuthnCredentialRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * ID of the WebAuthn credential to delete
   */
  @param:JsonProperty("credential_id")
  @get:JsonProperty("credential_id")
  @get:NotNull
  public val credentialId: String,
)
