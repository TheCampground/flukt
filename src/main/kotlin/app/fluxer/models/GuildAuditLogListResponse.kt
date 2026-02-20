package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.collections.List

public data class GuildAuditLogListResponse(
  /**
   * Array of audit log entries
   */
  @param:JsonProperty("audit_log_entries")
  @get:JsonProperty("audit_log_entries")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val auditLogEntries: List<GuildAuditLogEntryResponse>,
  /**
   * Users referenced in the audit log entries
   */
  @param:JsonProperty("users")
  @get:JsonProperty("users")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val users: List<UserPartialResponse>,
  /**
   * Webhooks referenced in the audit log entries
   */
  @param:JsonProperty("webhooks")
  @get:JsonProperty("webhooks")
  @get:NotNull
  @get:Size(max = 100)
  @get:Valid
  public val webhooks: List<AuditLogWebhookResponse>,
)
