package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

/**
 * The user profile data
 */
public data class UserProfileFullResponseUserProfile(
  @param:JsonProperty("bio")
  @get:JsonProperty("bio")
  public val bio: String?,
  @param:JsonProperty("pronouns")
  @get:JsonProperty("pronouns")
  public val pronouns: String?,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String?,
  @param:JsonProperty("banner_color")
  @get:JsonProperty("banner_color")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val bannerColor: Int? = null,
  @param:JsonProperty(
    "accent_color",
    required = true,
  )
  @get:JsonProperty("accent_color")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val accentColor: Int,
)
