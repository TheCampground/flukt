package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.Boolean
import kotlin.String

public data class MetadataValue(
  @param:JsonProperty("key")
  @get:JsonProperty("key")
  @get:NotNull
  public val key: String,
  @param:JsonProperty("label")
  @get:JsonProperty("label")
  @get:NotNull
  public val label: String,
  @param:JsonProperty("description")
  @get:JsonProperty("description")
  @get:NotNull
  public val description: String,
  @param:JsonProperty("category")
  @get:JsonProperty("category")
  @get:NotNull
  public val category: String,
  @param:JsonProperty("scope")
  @get:JsonProperty("scope")
  @get:NotNull
  public val scope: String,
  @param:JsonProperty(
    "isToggle",
    required = true,
  )
  @get:JsonProperty("isToggle")
  @get:NotNull
  public val isToggle: Boolean,
  @param:JsonProperty("unit")
  @get:JsonProperty("unit")
  public val unit: MetadataUnit? = null,
  @param:JsonProperty("min")
  @get:JsonProperty("min")
  public val min: BigDecimal? = null,
  @param:JsonProperty("max")
  @get:JsonProperty("max")
  public val max: BigDecimal? = null,
)
