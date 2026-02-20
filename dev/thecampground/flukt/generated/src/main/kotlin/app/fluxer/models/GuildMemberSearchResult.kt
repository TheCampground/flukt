package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class GuildMemberSearchResult(
  /**
   * Composite ID (guildId:userId)
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  /**
   * Guild ID
   */
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  public val guildId: String,
  /**
   * User ID
   */
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  public val userId: String,
  /**
   * Username
   */
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  @get:NotNull
  public val username: String,
  /**
   * Zero-padded 4-digit discriminator
   */
  @param:JsonProperty("discriminator")
  @get:JsonProperty("discriminator")
  @get:NotNull
  public val discriminator: String,
  @param:JsonProperty("global_name")
  @get:JsonProperty("global_name")
  public val globalName: String?,
  @param:JsonProperty("nickname")
  @get:JsonProperty("nickname")
  public val nickname: String?,
  /**
   * Role IDs
   */
  @param:JsonProperty("role_ids")
  @get:JsonProperty("role_ids")
  @get:NotNull
  public val roleIds: List<String>,
  /**
   * Unix timestamp of when the member joined
   */
  @param:JsonProperty("joined_at")
  @get:JsonProperty("joined_at")
  @get:NotNull
  public val joinedAt: BigDecimal,
  /**
   * Supplemental members-search-only metadata that is not part of the base guild member payload
   */
  @param:JsonProperty("supplemental")
  @get:JsonProperty("supplemental")
  @get:NotNull
  @get:Valid
  public val supplemental: GuildMemberSearchResultSupplemental,
  /**
   * Whether the user is a bot
   */
  @param:JsonProperty(
    "is_bot",
    required = true,
  )
  @get:JsonProperty("is_bot")
  @get:NotNull
  public val isBot: Boolean,
)
