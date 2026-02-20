package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import kotlin.Any
import kotlin.String

public data class GitHubWebhookComment(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  @get:Pattern(regexp = "^-?[0-9]+${'$'}")
  public val id: String,
  @param:JsonProperty("html_url")
  @get:JsonProperty("html_url")
  @get:NotNull
  public val htmlUrl: String,
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:NotNull
  @get:Valid
  public val user: GitHubWebhookUser,
  @param:JsonProperty("commit_id")
  @get:JsonProperty("commit_id")
  public val commitId: Any? = null,
  @param:JsonProperty("body")
  @get:JsonProperty("body")
  @get:NotNull
  public val body: String,
)
