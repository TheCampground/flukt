package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.Valid
import jakarta.validation.constraints.NotNull
import java.math.BigDecimal
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public data class LimitConfigGetResponse(
  @param:JsonProperty("limit_config")
  @get:JsonProperty("limit_config")
  @get:NotNull
  @get:Valid
  public val limitConfig: LimitConfigGetResponseLimitConfig,
  @param:JsonProperty("limit_config_json")
  @get:JsonProperty("limit_config_json")
  @get:NotNull
  public val limitConfigJson: String,
  @param:JsonProperty(
    "self_hosted",
    required = true,
  )
  @get:JsonProperty("self_hosted")
  @get:NotNull
  public val selfHosted: Boolean,
  @param:JsonProperty("defaults")
  @get:JsonProperty("defaults")
  @get:NotNull
  @get:Valid
  public val defaults: Map<String, Map<String, BigDecimal?>?>,
  @param:JsonProperty("metadata")
  @get:JsonProperty("metadata")
  @get:NotNull
  @get:Valid
  public val metadata: Map<String, MetadataValue?>,
  @param:JsonProperty("categories")
  @get:JsonProperty("categories")
  @get:NotNull
  public val categories: Map<String, String?>,
  @param:JsonProperty("limit_keys")
  @get:JsonProperty("limit_keys")
  @get:NotNull
  public val limitKeys: List<String>,
  @param:JsonProperty("bounds")
  @get:JsonProperty("bounds")
  @get:Valid
  public val bounds: Map<String, BoundsValue?>? = null,
)
