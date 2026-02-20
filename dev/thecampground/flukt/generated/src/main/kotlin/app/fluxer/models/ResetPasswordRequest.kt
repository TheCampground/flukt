package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String

public data class ResetPasswordRequest(
  /**
   * Password reset token from email
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  @get:NotNull
  public val token: String,
  @param:JsonProperty("password")
  @get:JsonProperty("password")
  @get:NotNull
  @get:Size(
    min = 8,
    max = 256,
  )
  public val password: String,
)
