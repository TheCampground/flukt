package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * The user associated with the token
 */
public data class OAuth2MeResponseUser(
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
  @param:JsonProperty(
    "avatar_color",
    required = true,
  )
  @get:JsonProperty("avatar_color")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val avatarColor: Int,
  /**
   * Whether the user is a bot
   */
  @param:JsonProperty("bot")
  @get:JsonProperty("bot")
  public val bot: Boolean? = null,
  /**
   * Whether the user is a system user
   */
  @param:JsonProperty("system")
  @get:JsonProperty("system")
  public val system: Boolean? = null,
  /**
   * The public flags on the user account
   */
  @param:JsonProperty(
    "flags",
    required = true,
  )
  @get:JsonProperty("flags")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val flags: Int,
  @param:JsonProperty("email")
  @get:JsonProperty("email")
  public val email: String? = null,
  @param:JsonProperty("verified")
  @get:JsonProperty("verified")
  public val verified: Boolean? = null,
)
