package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.collections.List

public data class AuditLogsListResponseSchema(
  @param:JsonProperty("logs")
  @get:JsonProperty("logs")
  @get:NotNull
  @get:Valid
  public val logs: List<AdminAuditLogResponseSchema>,
  @param:JsonProperty("total")
  @get:JsonProperty("total")
  @get:NotNull
  public val total: BigDecimal,
)
