package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.ByteArray
import kotlin.Int
import kotlin.String

public data class BotProfileUpdateRequest(
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:Pattern(regexp = "^[a-zA-Z0-9_]+${'$'}")
  @get:Size(
    min = 1,
    max = 32,
  )
  public val username: String? = null,
  /**
   * The discriminator of the bot
   */
  @param:JsonProperty("discriminator")
  @get:JsonProperty("discriminator")
  @get:Pattern(regexp = "^\\d{1,4}${'$'}")
  public val discriminator: String? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: ByteArray? = null,
  /**
   * Base64-encoded image data
   */
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: ByteArray? = null,
  @param:JsonProperty("bio")
  @get:JsonProperty("bio")
  public val bio: String? = null,
  /**
   * The bot user flags
   */
  @param:JsonProperty("bot_flags")
  @get:JsonProperty("bot_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val botFlags: Int? = null,
)
