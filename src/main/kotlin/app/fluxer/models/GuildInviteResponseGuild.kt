package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * The guild this invite is for
 */
public data class GuildInviteResponseGuild(
  /**
   * The unique identifier for this guild
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The name of the guild
   */
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: String? = null,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String? = null,
  @param:JsonProperty("banner_width")
  @get:JsonProperty("banner_width")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val bannerWidth: Int? = null,
  @param:JsonProperty("banner_height")
  @get:JsonProperty("banner_height")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val bannerHeight: Int? = null,
  @param:JsonProperty("splash")
  @get:JsonProperty("splash")
  public val splash: String? = null,
  @param:JsonProperty("splash_width")
  @get:JsonProperty("splash_width")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val splashWidth: Int? = null,
  @param:JsonProperty("splash_height")
  @get:JsonProperty("splash_height")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val splashHeight: Int? = null,
  /**
   * The alignment of the splash card
   */
  @param:JsonProperty(
    "splash_card_alignment",
    required = true,
  )
  @get:JsonProperty("splash_card_alignment")
  @get:NotNull
  public val splashCardAlignment: Int,
  @param:JsonProperty("embed_splash")
  @get:JsonProperty("embed_splash")
  public val embedSplash: String? = null,
  @param:JsonProperty("embed_splash_width")
  @get:JsonProperty("embed_splash_width")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val embedSplashWidth: Int? = null,
  @param:JsonProperty("embed_splash_height")
  @get:JsonProperty("embed_splash_height")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val embedSplashHeight: Int? = null,
  /**
   * Array of guild feature flags
   */
  @param:JsonProperty("features")
  @get:JsonProperty("features")
  @get:NotNull
  @get:Size(max = 100)
  public val features: List<String>,
)
