package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.time.OffsetDateTime
import kotlin.String

public data class GuildBanResponse(
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:NotNull
  @get:Valid
  public val user: UserPartialResponse,
  @param:JsonProperty("reason")
  @get:JsonProperty("reason")
  public val reason: String? = null,
  /**
   * The ID of the moderator who issued the ban
   */
  @param:JsonProperty("moderator_id")
  @get:JsonProperty("moderator_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val moderatorId: String,
  /**
   * ISO8601 timestamp of when the ban was issued
   */
  @param:JsonProperty("banned_at")
  @get:JsonProperty("banned_at")
  @get:NotNull
  public val bannedAt: OffsetDateTime,
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: OffsetDateTime? = null,
)
