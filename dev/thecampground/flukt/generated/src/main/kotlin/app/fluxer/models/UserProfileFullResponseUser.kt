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
 * The user object
 */
public data class UserProfileFullResponseUser(
  /**
   * The unique identifier (snowflake) for this user
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The username of the user, not unique across the platform
   */
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:NotNull
  public val username: String,
  /**
   * The four-digit discriminator tag of the user
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
   * Whether the user is a bot account
   */
  @param:JsonProperty("bot")
  @get:JsonProperty("bot")
  public val bot: Boolean? = null,
  /**
   * Whether the user is an official system user
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
)
