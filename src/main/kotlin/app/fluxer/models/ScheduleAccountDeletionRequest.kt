package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Int
import kotlin.String

public data class ScheduleAccountDeletionRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
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
   * Number of days until the account is deleted
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
