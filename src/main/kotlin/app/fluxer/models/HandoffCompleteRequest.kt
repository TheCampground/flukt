package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class HandoffCompleteRequest(
  /**
   * The handoff code from the initiating session
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  /**
   * The authentication token to transfer
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  @get:NotNull
  public val token: String,
  /**
   * The user ID associated with the token
   */
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  public val userId: String,
)
