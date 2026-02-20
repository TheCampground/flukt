package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.String

public data class SentryWebhookIssue(
  @param:JsonProperty("id")
  @get:JsonProperty("id")
  @get:NotNull
  public val id: String,
  @param:JsonProperty("shortId")
  @get:JsonProperty("shortId")
  @get:NotNull
  public val shortId: String,
  @param:JsonProperty("title")
  @get:JsonProperty("title")
  @get:NotNull
  public val title: String,
  @param:JsonProperty("culprit")
  @get:JsonProperty("culprit")
  public val culprit: String? = null,
  @param:JsonProperty("permalink")
  @get:JsonProperty("permalink")
  @get:NotNull
  public val permalink: String,
  @param:JsonProperty("level")
  @get:JsonProperty("level")
  @get:NotNull
  public val level: String,
  @param:JsonProperty("status")
  @get:JsonProperty("status")
  @get:NotNull
  public val status: String,
  @param:JsonProperty("platform")
  @get:JsonProperty("platform")
  @get:NotNull
  public val platform: String,
  @param:JsonProperty("project")
  @get:JsonProperty("project")
  @get:NotNull
  @get:Valid
  public val project: SentryWebhookProject,
  @param:JsonProperty("type")
  @get:JsonProperty("type")
  @get:NotNull
  public val type: String,
  @param:JsonProperty("metadata")
  @get:JsonProperty("metadata")
  @get:NotNull
  @get:Valid
  public val metadata: SentryWebhookMetadata,
  @param:JsonProperty("count")
  @get:JsonProperty("count")
  @get:NotNull
  public val count: String,
  @param:JsonProperty("userCount")
  @get:JsonProperty("userCount")
  @get:NotNull
  public val userCount: BigDecimal,
  @param:JsonProperty("firstSeen")
  @get:JsonProperty("firstSeen")
  @get:NotNull
  public val firstSeen: String,
  @param:JsonProperty("lastSeen")
  @get:JsonProperty("lastSeen")
  @get:NotNull
  public val lastSeen: String,
)
