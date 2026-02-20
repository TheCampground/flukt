package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class OAuth2UserInfoResponse(
  /**
   * The subject identifier of the user
   */
  @param:JsonProperty("sub")
  @get:JsonProperty("sub")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val sub: String,
  /**
   * The unique identifier of the user
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The username of the user
   */
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:NotNull
  public val username: String,
  /**
   * The discriminator of the user
   */
  @param:JsonProperty("discriminator")
  @get:JsonProperty("discriminator")
  @get:NotNull
  public val discriminator: String,
  @param:JsonProperty("global_name")
  @get:JsonProperty("global_name")
  public val globalName: String?,
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: String?,
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  public val email: String? = null,
  @param:JsonProperty("verified")
  @get:JsonProperty("verified")
  public val verified: Boolean? = null,
  /**
   * The public flags on the user account
   */
  @param:JsonProperty("flags")
  @get:JsonProperty("flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val flags: Int? = null,
)
