package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class ListUserChangeLogResponseSchema(
  @param:JsonProperty("entries")
  @get:JsonProperty("entries")
  @get:NotNull
  @get:Size(max = 200)
  @get:Valid
  public val entries: List<UserContactChangeLogEntrySchema>,
  @param:JsonProperty("next_page_token")
  @get:JsonProperty("next_page_token")
  public val nextPageToken: String?,
)
