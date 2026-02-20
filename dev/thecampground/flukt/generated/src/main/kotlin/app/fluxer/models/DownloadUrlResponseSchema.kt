package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class DownloadUrlResponseSchema(
  @param:JsonProperty("downloadUrl")
  @get:JsonProperty("downloadUrl")
  @get:NotNull
  public val downloadUrl: String,
  @param:JsonProperty("expiresAt")
  @get:JsonProperty("expiresAt")
  @get:NotNull
  public val expiresAt: String,
)
