package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class BulkScheduleUserDeletionRequest(
  /**
   * List of user IDs to schedule deletion for
   */
  @param:JsonProperty("user_ids")
  @get:JsonProperty("user_ids")
  @get:NotNull
  @get:Size(max = 1_000)
  public val userIds: List<String>,
  /**
   * Code indicating the reason for deletion
   */
  @param:JsonProperty(
    "reason_code",
    required = true,
  )
  @get:JsonProperty("reason_code")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val reasonCode: Int,
  /**
   * Public-facing reason for the deletion
   */
  @param:JsonProperty("public_reason")
  @get:JsonProperty("public_reason")
  public val publicReason: String? = null,
  /**
   * Number of days until the accounts are deleted
   */
  @param:JsonProperty("days_until_deletion")
  @get:JsonProperty("days_until_deletion")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "365",
    inclusive = true,
  )
  public val daysUntilDeletion: Int? = null,
)
