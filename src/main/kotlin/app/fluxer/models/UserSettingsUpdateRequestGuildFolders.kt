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
 * Guild folder organization
 */
public data class UserSettingsUpdateRequestGuildFolders(
  /**
   * Unique identifier for the folder (-1 for uncategorized)
   */
  @param:JsonProperty(
    "id",
    required = true,
  )
  @get:JsonProperty("id")
  @get:NotNull
  @get:DecimalMin(
    value = "-2147483648",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val id: Int,
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
   * Guild IDs in this folder
   */
  @param:JsonProperty("guild_ids")
  @get:JsonProperty("guild_ids")
  @get:NotNull
  @get:Size(max = 200)
  public val guildIds: List<String>,
)
