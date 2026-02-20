package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class DeleteAllUserMessagesResponse(
  @param:JsonProperty(
    "success",
    required = true,
  )
  @get:JsonProperty("success")
  @get:NotNull
  public val success: Boolean,
  @param:JsonProperty(
    "dry_run",
    required = true,
  )
  @get:JsonProperty("dry_run")
  @get:NotNull
  public val dryRun: Boolean,
  @param:JsonProperty(
    "channel_count",
    required = true,
  )
  @get:JsonProperty("channel_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val channelCount: Int,
  @param:JsonProperty(
    "message_count",
    required = true,
  )
  @get:JsonProperty("message_count")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val messageCount: Int,
  @param:JsonProperty("job_id")
  @get:JsonProperty("job_id")
  public val jobId: String? = null,
)
