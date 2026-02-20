package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class SentryWebhookProject(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("slug")
  @get:JsonProperty("slug")
  @get:NotNull
  public val slug: String,
  @param:JsonProperty("platform")
  @get:JsonProperty("platform")
  @get:NotNull
  public val platform: String,
)
