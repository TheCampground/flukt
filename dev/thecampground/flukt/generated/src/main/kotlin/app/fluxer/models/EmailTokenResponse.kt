package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class EmailTokenResponse(
  /**
   * The email change token to use for updating email
   */
  @param:JsonProperty("email_token")
  @get:JsonProperty("email_token")
  @get:NotNull
  public val emailToken: String,
)
