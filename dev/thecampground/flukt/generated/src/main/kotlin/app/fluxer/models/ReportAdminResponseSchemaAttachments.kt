package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class ReportAdminResponseSchemaAttachments(
  @param:JsonProperty("filename")
  @get:JsonProperty("filename")
  @get:NotNull
  public val filename: String,
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  @get:NotNull
  public val url: String,
)
