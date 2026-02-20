package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.collections.List

public data class SearchReportsResponse(
  @param:JsonProperty("reports")
  @get:JsonProperty("reports")
  @get:NotNull
  @get:Valid
  public val reports: List<ReportAdminResponseSchema>,
  @param:JsonProperty("total")
  @get:JsonProperty("total")
  @get:NotNull
  public val total: BigDecimal,
  @param:JsonProperty("offset")
  @get:JsonProperty("offset")
  @get:NotNull
  public val offset: BigDecimal,
  @param:JsonProperty("limit")
  @get:JsonProperty("limit")
  @get:NotNull
  public val limit: BigDecimal,
)
