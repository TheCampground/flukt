package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class GuildMemoryStatsResponseGuilds(
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  @param:JsonProperty("guild_name")
  @get:JsonProperty("guild_name")
  @get:NotNull
  public val guildName: String,
  @param:JsonProperty("guild_icon")
  @get:JsonProperty("guild_icon")
  public val guildIcon: String?,
  @param:JsonProperty("memory")
  @get:JsonProperty("memory")
  @get:NotNull
  @get:Pattern(regexp = "^-?[0-9]+${'$'}")
  public val memory: String,
  @param:JsonProperty(
    "member_count",
    required = true,
  )
  @get:JsonProperty("member_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val memberCount: Int,
  @param:JsonProperty(
    "session_count",
    required = true,
  )
  @get:JsonProperty("session_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val sessionCount: Int,
  @param:JsonProperty(
    "presence_count",
    required = true,
  )
  @get:JsonProperty("presence_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val presenceCount: Int,
)
