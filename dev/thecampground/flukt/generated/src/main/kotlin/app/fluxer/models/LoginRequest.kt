package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String

public data class LoginRequest(
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  @get:NotNull
  public val email: String,
  @param:JsonProperty("password")
  @get:JsonProperty("password")
  @get:NotNull
  @get:Size(
    min = 8,
    max = 256,
  )
  public val password: String,
  @param:JsonProperty("invite_code")
  @get:JsonProperty("invite_code")
  public val inviteCode: String? = null,
)
