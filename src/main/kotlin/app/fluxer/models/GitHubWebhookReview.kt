package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.String

public data class GitHubWebhookReview(
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:NotNull
  @get:Valid
  public val user: GitHubWebhookUser,
  @param:JsonProperty("body")
  @get:JsonProperty("body")
  public val body: Any? = null,
  @param:JsonProperty("html_url")
  @get:JsonProperty("html_url")
  @get:NotNull
  public val htmlUrl: String,
  @param:JsonProperty("state")
  @get:JsonProperty("state")
  @get:NotNull
  public val state: String,
)
