package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import kotlin.String

/**
 * Public application configuration for client-side features
 */
public data class WellKnownFluxerResponseAppPublic(
  /**
   * Sentry DSN for client-side error reporting
   */
  @param:JsonProperty("sentry_dsn")
  @get:JsonProperty("sentry_dsn")
  @get:NotNull
  public val sentryDsn: String,
)
