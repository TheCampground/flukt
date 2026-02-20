package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * The folder structure for organizing guilds in the sidebar
 */
public data class UserSettingsResponseGuildFolders(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:DecimalMin(
    value = "-2147483648",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val id: Int? = null,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  public val name: String? = null,
  @param:JsonProperty("color")
  @get:JsonProperty("color")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val color: Int? = null,
  /**
   * Bitfield for guild folder display behaviour
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
  /**
   * Selected icon for the guild folder
   */
  @param:JsonProperty("icon")
  @get:JsonProperty("icon")
  public val icon: GuildFoldersIcon? = null,
  /**
   * The IDs of guilds contained in this folder
   */
  @param:JsonProperty("guild_ids")
  @get:JsonProperty("guild_ids")
  @get:NotNull
  @get:Size(max = 200)
  public val guildIds: List<String>,
)
