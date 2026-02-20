package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class HarvestDownloadUrlResponse(
  /**
   * The presigned URL to download the harvest archive
   */
  @param:JsonProperty("download_url")
  @get:JsonProperty("download_url")
  @get:NotNull
  public val downloadUrl: String,
  /**
   * ISO 8601 timestamp when the harvest download expires
   */
  @param:JsonProperty("expires_at")
  @get:JsonProperty("expires_at")
  @get:NotNull
  public val expiresAt: String,
)
