package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String

public data class DsaReportUserRequest(
  /**
   * Verification ticket obtained from email verification
   */
  @param:JsonProperty("ticket")
  @get:JsonProperty("ticket")
  @get:NotNull
  public val ticket: String,
  /**
   * Additional context or details about the report
   */
  @param:JsonProperty("additional_info")
  @get:JsonProperty("additional_info")
  public val additionalInfo: String? = null,
  /**
   * Full legal name of the person filing the report
   */
  @param:JsonProperty("reporter_full_legal_name")
  @get:JsonProperty("reporter_full_legal_name")
  @get:NotNull
  public val reporterFullLegalName: String,
  /**
   * EU country code of the reporter residence
   */
  @param:JsonProperty("reporter_country_of_residence")
  @get:JsonProperty("reporter_country_of_residence")
  @get:NotNull
  public val reporterCountryOfResidence: DsaReportUserRequestReporterCountryOfResidence,
  /**
   * Fluxer tag of the reporter if they have an account
   */
  @param:JsonProperty("reporter_fluxer_tag")
  @get:JsonProperty("reporter_fluxer_tag")
  @get:Size(
    min = 3,
    max = 37,
  )
  public val reporterFluxerTag: String? = null,
  /**
   * Type of report
   */
  @param:JsonProperty("report_type")
  @get:JsonProperty("report_type")
  @get:NotNull
  public val reportType: DsaReportUserRequestReportType,
  /**
   * Category of the user report
   */
  @param:JsonProperty("category")
  @get:JsonProperty("category")
  @get:NotNull
  public val category: UserReportCategoryEnum,
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String? = null,
  /**
   * Fluxer tag of the user being reported
   */
  @param:JsonProperty("user_tag")
  @get:JsonProperty("user_tag")
  @get:Size(
    min = 3,
    max = 37,
  )
  public val userTag: String? = null,
)
