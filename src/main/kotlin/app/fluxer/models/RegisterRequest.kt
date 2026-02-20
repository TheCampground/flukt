package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.String

public data class RegisterRequest(
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  public val email: String? = null,
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:Pattern(regexp = "^[a-zA-Z0-9_]+${'$'}")
  @get:Size(
    min = 1,
    max = 32,
  )
  public val username: String? = null,
  /**
   * Display name shown to other users
   */
  @param:JsonProperty("global_name")
  @get:JsonProperty("global_name")
  public val globalName: String? = null,
  @param:JsonProperty("password")
  @get:JsonProperty("password")
  @get:Size(
    min = 8,
    max = 256,
  )
  public val password: String? = null,
  /**
   * Date of birth in YYYY-MM-DD format
   */
  @param:JsonProperty("date_of_birth")
  @get:JsonProperty("date_of_birth")
  @get:NotNull
  public val dateOfBirth: String,
  /**
   * Whether user consents to terms of service
   */
  @param:JsonProperty(
    "consent",
    required = true,
  )
  @get:JsonProperty("consent")
  @get:NotNull
  public val consent: Boolean,
  @param:JsonProperty("invite_code")
  @get:JsonProperty("invite_code")
  public val inviteCode: String? = null,
)
