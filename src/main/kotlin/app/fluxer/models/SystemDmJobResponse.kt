package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class SystemDmJobResponse(
  /**
   * Unique identifier for the job
   */
  @param:JsonProperty("job_id")
  @get:JsonProperty("job_id")
  @get:NotNull
  public val jobId: String,
  /**
   * Current status of the system DM job
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: SystemDmJobResponseStatus,
  /**
   * Message content being sent
   */
  @param:JsonProperty("content")
  @get:JsonProperty("content")
  @get:NotNull
  public val content: String,
  /**
   * Total number of users targeted
   */
  @param:JsonProperty(
    "target_count",
    required = true,
  )
  @get:JsonProperty("target_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val targetCount: Int,
  /**
   * Number of messages successfully sent
   */
  @param:JsonProperty(
    "sent_count",
    required = true,
  )
  @get:JsonProperty("sent_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val sentCount: Int,
  /**
   * Number of messages that failed to send
   */
  @param:JsonProperty(
    "failed_count",
    required = true,
  )
  @get:JsonProperty("failed_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val failedCount: Int,
  /**
   * ISO 8601 timestamp when the job was created
   */
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: String,
  @param:JsonProperty("approved_at")
  @get:JsonProperty("approved_at")
  public val approvedAt: String? = null,
  @param:JsonProperty("registration_start")
  @get:JsonProperty("registration_start")
  public val registrationStart: String? = null,
  @param:JsonProperty("registration_end")
  @get:JsonProperty("registration_end")
  public val registrationEnd: String? = null,
  /**
   * List of excluded guild IDs
   */
  @param:JsonProperty("excluded_guild_ids")
  @get:JsonProperty("excluded_guild_ids")
  @get:NotNull
  @get:Size(max = 100)
  public val excludedGuildIds: List<String>,
  @param:JsonProperty("last_error")
  @get:JsonProperty("last_error")
  public val lastError: String? = null,
)
