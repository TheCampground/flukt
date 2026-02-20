package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.String

public data class GitHubWebhookAuthor(
  @param:JsonProperty("username")
  @get:JsonProperty("username")
  public val username: Any? = null,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
)
