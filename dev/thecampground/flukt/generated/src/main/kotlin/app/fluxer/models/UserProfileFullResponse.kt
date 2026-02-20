package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class UserProfileFullResponse(
  /**
   * The user object
   */
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:NotNull
  @get:Valid
  public val user: UserProfileFullResponseUser,
  /**
   * The user profile data
   */
  @param:JsonProperty("user_profile")
  @get:JsonProperty("user_profile")
  @get:NotNull
  @get:Valid
  public val userProfile: UserProfileFullResponseUserProfile,
  @param:JsonProperty("guild_member")
  @get:JsonProperty("guild_member")
  @get:Valid
  public val guildMember: GuildMemberResponse? = null,
  @param:JsonProperty("guild_member_profile")
  @get:JsonProperty("guild_member_profile")
  @get:Valid
  public val guildMemberProfile: UserProfileFullResponseGuildMemberProfile? = null,
  /**
   * Premium subscription type
   */
  @param:JsonProperty("premium_type")
  @get:JsonProperty("premium_type")
  public val premiumType: Int? = null,
  /**
   * ISO8601 timestamp of when premium was activated
   */
  @param:JsonProperty("premium_since")
  @get:JsonProperty("premium_since")
  public val premiumSince: String? = null,
  @param:JsonProperty("premium_lifetime_sequence")
  @get:JsonProperty("premium_lifetime_sequence")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val premiumLifetimeSequence: Int? = null,
  /**
   * Array of mutual friends
   */
  @param:JsonProperty("mutual_friends")
  @get:JsonProperty("mutual_friends")
  @get:Valid
  public val mutualFriends: List<UserPartialResponse>? = null,
  /**
   * Array of mutual guilds
   */
  @param:JsonProperty("mutual_guilds")
  @get:JsonProperty("mutual_guilds")
  @get:Valid
  public val mutualGuilds: List<MutualGuildResponse>? = null,
  /**
   * Array of verified external connections
   */
  @param:JsonProperty("connected_accounts")
  @get:JsonProperty("connected_accounts")
  @get:Valid
  public val connectedAccounts: List<ConnectionResponse>? = null,
)
