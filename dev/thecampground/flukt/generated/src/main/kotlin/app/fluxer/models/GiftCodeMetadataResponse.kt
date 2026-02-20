package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.time.OffsetDateTime
import kotlin.Int
import kotlin.String

public data class GiftCodeMetadataResponse(
  /**
   * The unique gift code string
   */
  @param:JsonProperty("code")
  @get:JsonProperty("code")
  @get:NotNull
  public val code: String,
  /**
   * Duration of the subscription gift in months
   */
  @param:JsonProperty(
    "duration_months",
    required = true,
  )
  @get:JsonProperty("duration_months")
  @get:NotNull
  public val durationMonths: Int,
  /**
   * Timestamp when the gift code was created
   */
  @param:JsonProperty("created_at")
  @get:JsonProperty("created_at")
  @get:NotNull
  public val createdAt: OffsetDateTime,
  @param:JsonProperty("created_by")
  @get:JsonProperty("created_by")
  @get:NotNull
  @get:Valid
  public val createdBy: UserPartialResponse,
  @param:JsonProperty("redeemed_at")
  @get:JsonProperty("redeemed_at")
  public val redeemedAt: OffsetDateTime? = null,
  @param:JsonProperty("redeemed_by")
  @get:JsonProperty("redeemed_by")
  @get:Valid
  public val redeemedBy: UserPartialResponse? = null,
)
