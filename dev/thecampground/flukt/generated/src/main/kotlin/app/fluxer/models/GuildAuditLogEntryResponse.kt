package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class GuildAuditLogEntryResponse(
  /**
   * The unique identifier for this audit log entry
   */
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val id: String,
  /**
   * The type of action that occurred
   */
  @param:JsonProperty(
    "action_type",
    required = true,
  )
  @get:JsonProperty("action_type")
  @get:NotNull
  public val actionType: Int,
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String? = null,
  @param:JsonProperty("target_id")
  @get:JsonProperty("target_id")
  public val targetId: String? = null,
  /**
   * The reason provided for the action
   */
  @param:JsonProperty("reason")
  @get:JsonProperty("reason")
  public val reason: String? = null,
  /**
   * Additional options depending on action type
   */
  @param:JsonProperty("options")
  @get:JsonProperty("options")
  @get:Valid
  public val options: GuildAuditLogEntryResponseOptions? = null,
  /**
   * Changes made to the target
   */
  @param:JsonProperty("changes")
  @get:JsonProperty("changes")
  @get:Valid
  public val changes: List<AuditLogChangeSchema>? = null,
)
