package app.fluxer.models

import com.fasterxml.jackson.`annotation`.JsonProperty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.String
import kotlin.collections.List

public data class LogoutAuthSessionsRequest(
  /**
   * Array of session ID hashes to log out (max 100)
   */
  @param:JsonProperty("session_id_hashes")
  @get:JsonProperty("session_id_hashes")
  @get:NotNull
  @get:Size(max = 100)
  public val sessionIdHashes: List<String>,
  @param:JsonProperty("password")
  @get:JsonProperty("password")
  @get:Size(
    min = 8,
    max = 256,
  )
  public val password: String? = null,
)
