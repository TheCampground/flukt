package dev.thecampground.dev.thecampground.flukt

data class FluktOptions(
    val baseUrl: String = "https://api.fluxer.app",
    val token: String? = null,
    val debug: Boolean = false,

    val maxRetries: Int = 3,
    val retryOnException: Boolean = true,
)