package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class GuildMemberResponse(
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:NotNull
  @get:Valid
  public val user: UserPartialResponse,
  @param:JsonProperty("nick")
  @get:JsonProperty("nick")
  public val nick: String? = null,
  @param:JsonProperty("avatar")
  @get:JsonProperty("avatar")
  public val avatar: String? = null,
  @param:JsonProperty("banner")
  @get:JsonProperty("banner")
  public val banner: String? = null,
  @param:JsonProperty("accent_color")
  @get:JsonProperty("accent_color")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val accentColor: Int? = null,
  /**
   * Array of role IDs the member has
   */
  @param:JsonProperty("roles")
  @get:JsonProperty("roles")
  @get:NotNull
  @get:Size(max = 250)
  public val roles: List<String>,
  /**
   * ISO8601 timestamp of when the user joined the guild
   */
  @param:JsonProperty("joined_at")
  @get:JsonProperty("joined_at")
  @get:NotNull
  public val joinedAt: OffsetDateTime,
  /**
   * Whether the member is muted in voice channels
   */
  @param:JsonProperty(
    "mute",
    required = true,
  )
  @get:JsonProperty("mute")
  @get:NotNull
  public val mute: Boolean,
  /**
   * Whether the member is deafened in voice channels
   */
  @param:JsonProperty(
    "deaf",
    required = true,
  )
  @get:JsonProperty("deaf")
  @get:NotNull
  public val deaf: Boolean,
  @param:JsonProperty("communication_disabled_until")
  @get:JsonProperty("communication_disabled_until")
  public val communicationDisabledUntil: OffsetDateTime? = null,
  /**
   * Member profile flags
   */
  @param:JsonProperty("profile_flags")
  @get:JsonProperty("profile_flags")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val profileFlags: Int? = null,
)
