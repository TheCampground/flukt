package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import java.math.BigDecimal
import kotlin.String

public data class AdminArchiveResponseSchema(
  @param:JsonProperty("archive_id")
  @get:JsonProperty("archive_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val archiveId: String,
  /**
   * Type of subject being archived
   */
  @param:JsonProperty("subject_type")
  @get:JsonProperty("subject_type")
  @get:NotNull
  public val subjectType: AdminArchiveResponseSchemaSubjectType,
  @param:JsonProperty("subject_id")
  @get:JsonProperty("subject_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val subjectId: String,
  @param:JsonProperty("requested_by")
  @get:JsonProperty("requested_by")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val requestedBy: String,
  @param:JsonProperty("requested_at")
  @get:JsonProperty("requested_at")
  @get:NotNull
  public val requestedAt: String,
  @param:JsonProperty("started_at")
  @get:JsonProperty("started_at")
  public val startedAt: String?,
  @param:JsonProperty("completed_at")
  @get:JsonProperty("completed_at")
  public val completedAt: String?,
  @param:JsonProperty("failed_at")
  @get:JsonProperty("failed_at")
  public val failedAt: String?,
  @param:JsonProperty("file_size")
  @get:JsonProperty("file_size")
  public val fileSize: String?,
  @param:JsonProperty("progress_percent")
  @get:JsonProperty("progress_percent")
  @get:NotNull
  public val progressPercent: BigDecimal,
  @param:JsonProperty("progress_step")
  @get:JsonProperty("progress_step")
  public val progressStep: String?,
  @param:JsonProperty("error_message")
  @get:JsonProperty("error_message")
  public val errorMessage: String?,
  @param:JsonProperty("download_url_expires_at")
  @get:JsonProperty("download_url_expires_at")
  public val downloadUrlExpiresAt: String?,
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  public val expiresAt: String?,
)
