package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import kotlin.Int
import kotlin.String

public data class GuildBanCreateRequest(
  /**
   * Number of days of messages to delete from the banned user (0-7)
   */
  @param:JsonProperty("delete_message_days")
  @get:JsonProperty("delete_message_days")
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "7",
    inclusive = true,
  )
  public val deleteMessageDays: Int? = null,
  @param:JsonProperty("reason")
  @get:JsonProperty("reason")
  public val reason: String? = null,
  /**
   * Duration of the ban in seconds (0 for permanent, or a valid temporary duration)
   */
  @param:JsonProperty("ban_duration_seconds")
  @get:JsonProperty("ban_duration_seconds")
  public val banDurationSeconds: Int? = null,
)
