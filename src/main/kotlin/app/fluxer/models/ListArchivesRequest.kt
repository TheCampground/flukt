package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Pattern
import java.math.BigDecimal
import kotlin.Boolean
import kotlin.String

public data class ListArchivesRequest(
  /**
   * Type of archives to list
   */
  @param:JsonProperty("subject_type")
  @get:JsonProperty("subject_type")
  public val subjectType: ListArchivesRequestSubjectType? = null,
  @param:JsonProperty("subject_id")
  @get:JsonProperty("subject_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val subjectId: String? = null,
  @param:JsonProperty("requested_by")
  @get:JsonProperty("requested_by")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val requestedBy: String? = null,
  /**
   * Maximum number of archives to return
   */
  @param:JsonProperty("limit")
  @get:JsonProperty("limit")
  @get:DecimalMin(
    value = "1",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "200",
    inclusive = true,
  )
  public val limit: BigDecimal? = null,
  /**
   * Whether to include expired archives
   */
  @param:JsonProperty("include_expired")
  @get:JsonProperty("include_expired")
  public val includeExpired: Boolean? = null,
)
