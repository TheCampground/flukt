package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public data class GitHubWebhook(
  @param:JsonProperty("action")
  @get:JsonProperty("action")
  public val action: String? = null,
  @param:JsonProperty("answer")
  @get:JsonProperty("answer")
  @get:Valid
  public val answer: GitHubWebhookAnswer? = null,
  @param:JsonProperty("check_run")
  @get:JsonProperty("check_run")
  @get:Valid
  public val checkRun: GitHubWebhookCheckRun? = null,
  @param:JsonProperty("check_suite")
  @get:JsonProperty("check_suite")
  @get:Valid
  public val checkSuite: GitHubWebhookCheckSuite? = null,
  @param:JsonProperty("comment")
  @get:JsonProperty("comment")
  @get:Valid
  public val comment: GitHubWebhookComment? = null,
  @param:JsonProperty("commits")
  @get:JsonProperty("commits")
  @get:Valid
  public val commits: List<GitHubWebhookCommits>? = null,
  @param:JsonProperty("compare")
  @get:JsonProperty("compare")
  public val compare: String? = null,
  @param:JsonProperty("discussion")
  @get:JsonProperty("discussion")
  @get:Valid
  public val discussion: GitHubWebhookDiscussion? = null,
  @param:JsonProperty("forced")
  @get:JsonProperty("forced")
  public val forced: Boolean? = null,
  @param:JsonProperty("forkee")
  @get:JsonProperty("forkee")
  @get:Valid
  public val forkee: GitHubWebhookForkee? = null,
  @param:JsonProperty("head_commit")
  @get:JsonProperty("head_commit")
  @get:Valid
  public val headCommit: GitHubWebhookHeadCommit? = null,
  @param:JsonProperty("issue")
  @get:JsonProperty("issue")
  @get:Valid
  public val issue: GitHubWebhookIssue? = null,
  @param:JsonProperty("member")
  @get:JsonProperty("member")
  @get:Valid
  public val member: GitHubWebhookMember? = null,
  @param:JsonProperty("pull_request")
  @get:JsonProperty("pull_request")
  @get:Valid
  public val pullRequest: GitHubWebhookPullRequest? = null,
  @param:JsonProperty("ref_type")
  @get:JsonProperty("ref_type")
  public val refType: String? = null,
  @param:JsonProperty("ref")
  @get:JsonProperty("ref")
  public val ref: String? = null,
  @param:JsonProperty("release")
  @get:JsonProperty("release")
  @get:Valid
  public val release: GitHubWebhookRelease? = null,
  @param:JsonProperty("repository")
  @get:JsonProperty("repository")
  @get:Valid
  public val repository: GitHubWebhookRepository? = null,
  @param:JsonProperty("review")
  @get:JsonProperty("review")
  @get:Valid
  public val review: GitHubWebhookReview? = null,
  @param:JsonProperty("sender")
  @get:JsonProperty("sender")
  @get:NotNull
  @get:Valid
  public val sender: GitHubWebhookSender,
)
