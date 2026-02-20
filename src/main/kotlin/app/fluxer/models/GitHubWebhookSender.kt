package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.NotNull
import kotlin.Int
import kotlin.String

public data class GitHubWebhookSender(
  @param:JsonProperty(
    "id",
    required = true,
  )
  @get:JsonProperty("id")
  @get:NotNull
  @get:DecimalMin(
    value = "0",
    inclusive = true,
  )
  @get:DecimalMax(
    value = "2147483647",
    inclusive = true,
  )
  public val id: Int,
  @param:JsonProperty("login")
  @get:JsonProperty("login")
  @get:NotNull
  public val login: String,
  @param:JsonProperty("html_url")
  @get:JsonProperty("html_url")
  @get:NotNull
  public val htmlUrl: String,
  @param:JsonProperty("avatar_url")
  @get:JsonProperty("avatar_url")
  @get:NotNull
  public val avatarUrl: String,
)
