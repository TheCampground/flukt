package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Size
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class GuildMemberSearchRequest(
  /**
   * Text to search for in usernames, global names, and nicknames
   */
  @param:JsonProperty("query")
  @get:JsonProperty("query")
  @get:Size(max = 100)
  public val query: String? = null,
  /**
   * Maximum number of results to return
   */
  @param:JsonProperty("limit")
  @get:JsonProperty("limit")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "100",
    inclusive = true,
  )
  public val limit: Int? = null,
  /**
   * Number of results to skip for pagination
   */
  @param:JsonProperty("offset")
  @get:JsonProperty("offset")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "9007199254740991",
    inclusive = true,
  )
  public val offset: Long? = null,
  /**
   * Filter by role IDs (member must have all specified roles)
   */
  @param:JsonProperty("role_ids")
  @get:JsonProperty("role_ids")
  @get:Size(max = 10)
  public val roleIds: List<String>? = null,
  /**
   * Filter members who joined at or after this unix timestamp
   */
  @param:JsonProperty("joined_at_gte")
  @get:JsonProperty("joined_at_gte")
  public val joinedAtGte: Int? = null,
  /**
   * Filter members who joined at or before this unix timestamp
   */
  @param:JsonProperty("joined_at_lte")
  @get:JsonProperty("joined_at_lte")
  public val joinedAtLte: Int? = null,
  /**
   * Filter by join source types
   */
  @param:JsonProperty("join_source_type")
  @get:JsonProperty("join_source_type")
  @get:Size(max = 10)
  public val joinSourceType: List<Int>? = null,
  /**
   * Filter by invite codes used to join
   */
  @param:JsonProperty("source_invite_code")
  @get:JsonProperty("source_invite_code")
  @get:Size(max = 10)
  public val sourceInviteCode: List<String>? = null,
  /**
   * Filter by bot status
   */
  @param:JsonProperty("is_bot")
  @get:JsonProperty("is_bot")
  public val isBot: Boolean? = null,
  /**
   * Filter members whose account was created at or after this unix timestamp
   */
  @param:JsonProperty("user_created_at_gte")
  @get:JsonProperty("user_created_at_gte")
  public val userCreatedAtGte: Int? = null,
  /**
   * Filter members whose account was created at or before this unix timestamp
   */
  @param:JsonProperty("user_created_at_lte")
  @get:JsonProperty("user_created_at_lte")
  public val userCreatedAtLte: Int? = null,
  /**
   * Sort results by field
   */
  @param:JsonProperty("sort_by")
  @get:JsonProperty("sort_by")
  public val sortBy: GuildMemberSearchRequestSortBy? = null,
  /**
   * Sort order
   */
  @param:JsonProperty("sort_order")
  @get:JsonProperty("sort_order")
  public val sortOrder: GuildMemberSearchRequestSortOrder? = null,
)
