package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Detailed bot user metadata
 */
public data class ApplicationBotResponse(
  /**
   * The unique identifier of the bot user
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The username of the bot
   */
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:NotNull
  public val username: String,
  /**
   * The discriminator of the bot
   */
  @param:JsonProperty("discriminator")
  @get:JsonProperty("discriminator")
  @get:NotNull
  public val discriminator: String,
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: String? = null,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String? = null,
  @param:JsonProperty("bio")
  @get:JsonProperty("bio")
  public val bio: String?,
  /**
   * The bot token for authentication
   */
  @param:JsonProperty("token")
  @get:JsonProperty("token")
  public val token: String? = null,
  /**
   * Whether the bot has MFA enabled
   */
  @param:JsonProperty("mfa_enabled")
  @get:JsonProperty("mfa_enabled")
  public val mfaEnabled: Boolean? = null,
  /**
   * The types of authenticators enabled
   */
  @param:JsonProperty("authenticator_types")
  @get:JsonProperty("authenticator_types")
  @get:Size(max = 10)
  public val authenticatorTypes: List<Int>? = null,
  /**
   * The bot user flags
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
