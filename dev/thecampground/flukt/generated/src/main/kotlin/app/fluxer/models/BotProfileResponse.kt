package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class BotProfileResponse(
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
  public val avatar: String?,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String?,
  @param:JsonProperty("bio")
  @get:JsonProperty("bio")
  public val bio: String?,
)
