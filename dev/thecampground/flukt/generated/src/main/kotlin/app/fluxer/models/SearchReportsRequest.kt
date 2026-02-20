package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class SearchReportsRequest(
  /**
   * Search query string
   */
  @param:JsonProperty("query")
  @get:JsonProperty("query")
  public val query: String? = null,
  /**
   * Maximum number of entries to return
   */
  @param:JsonProperty("limit")
  @get:JsonProperty("limit")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "200",
    inclusive = true,
  )
  public val limit: Int? = null,
  /**
   * Number of entries to skip
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
  @param:JsonProperty("reporter_id")
  @get:JsonProperty("reporter_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reporterId: String? = null,
  /**
   * The status of the report
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  public val status: Int? = null,
  /**
   * The type of entity being reported
   */
  @param:JsonProperty("report_type")
  @get:JsonProperty("report_type")
  public val reportType: Int? = null,
  /**
   * Filter by report category
   */
  @param:JsonProperty("category")
  @get:JsonProperty("category")
  public val category: String? = null,
  @param:JsonProperty("reported_user_id")
  @get:JsonProperty("reported_user_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportedUserId: String? = null,
  @param:JsonProperty("reported_guild_id")
  @get:JsonProperty("reported_guild_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportedGuildId: String? = null,
  @param:JsonProperty("reported_channel_id")
  @get:JsonProperty("reported_channel_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val reportedChannelId: String? = null,
  @param:JsonProperty("guild_context_id")
  @get:JsonProperty("guild_context_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildContextId: String? = null,
  @param:JsonProperty("resolved_by_admin_id")
  @get:JsonProperty("resolved_by_admin_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val resolvedByAdminId: String? = null,
  /**
   * Field to sort reports by
   */
  @param:JsonProperty("sort_by")
  @get:JsonProperty("sort_by")
  public val sortBy: SearchReportsRequestSortBy? = null,
  /**
   * Sort order direction
   */
  @param:JsonProperty("sort_order")
  @get:JsonProperty("sort_order")
  public val sortOrder: SearchReportsRequestSortOrder? = null,
)
