package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class SsoCompleteResponse(
  /**
   * Authentication token for the session
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  @get:NotNull
  public val token: String,
  /**
   * ID of the authenticated user
   */
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * URL to redirect the user to after completion
   */
  @param:JsonProperty("redirect_to")
  @get:JsonProperty("redirect_to")
  @get:NotNull
  public val redirectTo: String,
)
