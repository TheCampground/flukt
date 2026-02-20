package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String

public data class DsaReportMessageRequest(
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
  public val reporterCountryOfResidence: DsaReportMessageRequestReporterCountryOfResidence,
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
  public val reportType: DsaReportMessageRequestReportType,
  /**
   * Category of the message report
   */
  @param:JsonProperty("category")
  @get:JsonProperty("category")
  @get:NotNull
  public val category: MessageReportCategoryEnum,
  /**
   * Link to the message being reported
   */
  @param:JsonProperty("message_link")
  @get:JsonProperty("message_link")
  @get:NotNull
  public val messageLink: String,
  /**
   * Fluxer tag of the user who sent the message
   */
  @param:JsonProperty("reported_user_tag")
  @get:JsonProperty("reported_user_tag")
  @get:Size(
    min = 3,
    max = 37,
  )
  public val reportedUserTag: String? = null,
)
