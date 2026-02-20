package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.Int
import kotlin.String

public data class GiftCodeResponse(
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
   * Whether the gift code has been redeemed
   */
  @param:JsonProperty(
    "redeemed",
    required = true,
  )
  @get:JsonProperty("redeemed")
  @get:NotNull
  public val redeemed: Boolean,
  @param:JsonProperty("created_by")
  @get:JsonProperty("created_by")
  @get:Valid
  public val createdBy: UserPartialResponse? = null,
)
