package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Any
import kotlin.Int
import kotlin.String

public data class GitHubWebhookDiscussion(
  @param:JsonProperty("title")
  @get:JsonProperty("title")
  @get:NotNull
  public val title: String,
  @param:JsonProperty(
    "number",
    required = true,
  )
  @get:JsonProperty("number")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val number: Int,
  @param:JsonProperty("html_url")
  @get:JsonProperty("html_url")
  @get:NotNull
  public val htmlUrl: String,
  @param:JsonProperty("answer_html_url")
  @get:JsonProperty("answer_html_url")
  public val answerHtmlUrl: Any? = null,
  @param:JsonProperty("body")
  @get:JsonProperty("body")
  public val body: Any? = null,
  @param:JsonProperty("user")
  @get:JsonProperty("user")
  @get:NotNull
  @get:Valid
  public val user: GitHubWebhookUser,
)
