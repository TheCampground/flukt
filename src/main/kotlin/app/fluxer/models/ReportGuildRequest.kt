package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class ReportGuildRequest(
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String,
  /**
   * Category of the guild report
   */
  @param:JsonProperty("category")
  @get:JsonProperty("category")
  @get:NotNull
  public val category: GuildReportCategoryEnum,
  /**
   * Additional context or details about the report
   */
  @param:JsonProperty("additional_info")
  @get:JsonProperty("additional_info")
  public val additionalInfo: String? = null,
)
