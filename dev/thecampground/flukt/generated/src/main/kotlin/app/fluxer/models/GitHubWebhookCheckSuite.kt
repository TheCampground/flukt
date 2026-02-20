package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.String

public data class GitHubWebhookCheckSuite(
  @param:JsonProperty("conclusion")
  @get:JsonProperty("conclusion")
  public val conclusion: Any? = null,
  @param:JsonProperty("head_branch")
  @get:JsonProperty("head_branch")
  public val headBranch: Any? = null,
  @param:JsonProperty("head_sha")
  @get:JsonProperty("head_sha")
  @get:NotNull
  public val headSha: String,
  @param:JsonProperty("pull_requests")
  @get:JsonProperty("pull_requests")
  public val pullRequests: Any? = null,
  @param:JsonProperty("app")
  @get:JsonProperty("app")
  @get:NotNull
  @get:Valid
  public val app: GitHubWebhookApp,
)
