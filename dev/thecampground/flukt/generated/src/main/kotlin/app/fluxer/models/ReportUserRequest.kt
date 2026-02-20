package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.String

public data class ReportUserRequest(
  @param:JsonProperty("user_id")
  @get:JsonProperty("user_id")
  @get:NotNull
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val userId: String,
  /**
   * Category of the user report
   */
  @param:JsonProperty("category")
  @get:JsonProperty("category")
  @get:NotNull
  public val category: UserReportCategoryEnum,
  /**
   * Additional context or details about the report
   */
  @param:JsonProperty("additional_info")
  @get:JsonProperty("additional_info")
  public val additionalInfo: String? = null,
  @param:JsonProperty("guild_id")
  @get:JsonProperty("guild_id")
  @get:Pattern(regexp = "^(0|[1-9][0-9]*)${'$'}")
  public val guildId: String? = null,
)
