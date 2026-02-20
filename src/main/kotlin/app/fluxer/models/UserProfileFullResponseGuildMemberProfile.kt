package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Any

public data class UserProfileFullResponseGuildMemberProfile(
  /**
   * Guild-specific biography text
   */
  @param:JsonProperty("bio")
  @get:JsonProperty("bio")
  @get:NotNull
  public val bio: Any,
  /**
   * Guild-specific pronouns
   */
  @param:JsonProperty("pronouns")
  @get:JsonProperty("pronouns")
  @get:NotNull
  public val pronouns: Any,
  /**
   * Hash of the guild-specific banner image
   */
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  @get:NotNull
  public val banner: Any,
  /**
   * Guild-specific accent color
   */
  @param:JsonProperty("accent_color")
  @get:JsonProperty("accent_color")
  @get:NotNull
  public val accentColor: Any,
)
