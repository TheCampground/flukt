package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String
import kotlin.collections.Map

public data class AdminAuditLogResponseSchema(
  @param:JsonProperty("log_id")
  @get:JsonProperty("log_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val logId: String,
  @param:JsonProperty("admin_user_id")
  @get:JsonProperty("admin_user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val adminUserId: String,
  @param:JsonProperty("target_type")
  @get:JsonProperty("target_type")
  @get:NotNull
  public val targetType: String,
  /**
   * The ID of the affected entity (user, channel, role, invite code, etc.)
   */
  @param:JsonProperty("target_id")
  @get:JsonProperty("target_id")
  @get:NotNull
  public val targetId: String,
  @param:JsonProperty("action")
  @get:JsonProperty("action")
  @get:NotNull
  public val action: String,
  @param:JsonProperty("audit_log_reason")
  @get:JsonProperty("audit_log_reason")
  public val auditLogReason: String?,
  @param:JsonProperty("metadata")
  @get:JsonProperty("metadata")
  @get:NotNull
  public val metadata: Map<String, String?>,
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: String,
)
