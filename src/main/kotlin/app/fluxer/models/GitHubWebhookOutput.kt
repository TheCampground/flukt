package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import kotlin.Any

public data class GitHubWebhookOutput(
  @param:JsonProperty("title")
  @get:JsonProperty("title")
  public val title: Any? = null,
  @param:JsonProperty("summary")
  @get:JsonProperty("summary")
  public val summary: Any? = null,
)
