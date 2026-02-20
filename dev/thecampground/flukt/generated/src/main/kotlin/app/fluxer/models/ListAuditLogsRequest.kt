package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class ListAuditLogsRequest(
  @param:JsonProperty("admin_user_id")
  @get:JsonProperty("admin_user_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val adminUserId: String? = null,
  /**
   * Filter by target entity type
   */
  @param:JsonProperty("target_type")
  @get:JsonProperty("target_type")
  public val targetType: String? = null,
  /**
   * Filter by target entity ID (user, channel, role, invite code, etc.)
   */
  @param:JsonProperty("target_id")
  @get:JsonProperty("target_id")
  public val targetId: String? = null,
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
