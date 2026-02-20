package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.String

public data class GitHubWebhookCheckRun(
  @param:JsonProperty("conclusion")
  @get:JsonProperty("conclusion")
  public val conclusion: Any? = null,
  @param:JsonProperty("name")
  @get:JsonProperty("name")
  @get:NotNull
  public val name: String,
  @param:JsonProperty("html_url")
  @get:JsonProperty("html_url")
  @get:NotNull
  public val htmlUrl: String,
  @param:JsonProperty("check_suite")
  @get:JsonProperty("check_suite")
  @get:NotNull
  @get:Valid
  public val checkSuite: GitHubWebhookCheckSuite,
  @param:JsonProperty("details_url")
  @get:JsonProperty("details_url")
  public val detailsUrl: Any? = null,
  @param:JsonProperty("output")
  @get:JsonProperty("output")
  @get:Valid
  public val output: GitHubWebhookOutput? = null,
  @param:JsonProperty("pull_requests")
  @get:JsonProperty("pull_requests")
  public val pullRequests: Any? = null,
)
