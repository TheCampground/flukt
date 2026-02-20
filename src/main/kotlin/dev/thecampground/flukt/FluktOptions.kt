package dev.thecampground.dev.thecampground.flukt

data class FluktOptions(
    var baseUrl: String = "https://api.fluxer.app",
    var token: String? = null,
    var debug: Boolean = false,

    var maxRetries: Int = 3,
    var retryOnException: Boolean = true,
)