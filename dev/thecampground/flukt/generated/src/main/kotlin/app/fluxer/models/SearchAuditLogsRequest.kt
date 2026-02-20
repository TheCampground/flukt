package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class SearchAuditLogsRequest(
  /**
   * Search query string
   */
  @param:JsonProperty("query")
  @get:JsonProperty("query")
  public val query: String? = null,
  @param:JsonProperty("admin_user_id")
  @get:JsonProperty("admin_user_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val adminUserId: String? = null,
  /**
   * Filter by target entity ID (user, channel, role, invite code, etc.)
   */
  @param:JsonProperty("target_id")
  @get:JsonProperty("target_id")
  public val targetId: String? = null,
  /**
   * Field to sort audit logs by
   */
  @param:JsonProperty("sort_by")
  @get:JsonProperty("sort_by")
  public val sortBy: SearchAuditLogsRequestSortBy? = null,
  /**
   * Sort order direction
   */
  @param:JsonProperty("sort_order")
  @get:JsonProperty("sort_order")
  public val sortOrder: SearchAuditLogsRequestSortOrder? = null,
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
)
