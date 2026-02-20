package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class MessageShredStatusProgressResponse(
  /**
   * Current message shred job status
   */
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: MessageShredStatusProgressResponseStatus,
  @param:JsonProperty(
    "requested",
    required = true,
  )
  @get:JsonProperty("requested")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val requested: Int,
  @param:JsonProperty(
    "total",
    required = true,
  )
  @get:JsonProperty("total")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val total: Int,
  @param:JsonProperty(
    "processed",
    required = true,
  )
  @get:JsonProperty("processed")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val processed: Int,
  @param:JsonProperty(
    "skipped",
    required = true,
  )
  @get:JsonProperty("skipped")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val skipped: Int,
  @param:JsonProperty("started_at")
  @get:JsonProperty("started_at")
  public val startedAt: String? = null,
  @param:JsonProperty("completed_at")
  @get:JsonProperty("completed_at")
  public val completedAt: String? = null,
  @param:JsonProperty("failed_at")
  @get:JsonProperty("failed_at")
  public val failedAt: String? = null,
  @param:JsonProperty("error")
  @get:JsonProperty("error")
  public val error: String? = null,
)
