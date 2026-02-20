package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import kotlin.String

public data class GitHubWebhookHeadCommit(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  @param:JsonProperty("url")
  @get:JsonProperty("url")
  @get:NotNull
  public val url: String,
  @param:JsonProperty("message")
  @get:JsonProperty("message")
  @get:NotNull
  public val message: String,
  @param:JsonProperty("author")
  @get:JsonProperty("author")
  @get:NotNull
  @get:Valid
  public val author: GitHubWebhookAuthor,
)
