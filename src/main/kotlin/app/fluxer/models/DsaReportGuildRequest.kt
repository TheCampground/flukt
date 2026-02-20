package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import kotlin.String

public data class DsaReportGuildRequest(
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
  public val reporterCountryOfResidence: DsaReportGuildRequestReporterCountryOfResidence,
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
  public val reportType: DsaReportGuildRequestReportType,
  /**
   * Category of the guild report
   */
  @param:JsonProperty("category")
  @get:JsonProperty("category")
  @get:NotNull
  public val category: GuildReportCategoryEnum,
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  /**
   * Invite code used to access the guild
   */
  @param:JsonProperty("invite_code")
  @get:JsonProperty("invite_code")
  public val inviteCode: String? = null,
)
