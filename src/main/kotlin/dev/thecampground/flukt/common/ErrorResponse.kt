package dev.thecampground.dev.thecampground.flukt.common

sealed class ErrorResponse {
    class UnknownError : ErrorResponse()
    class NetworkError : ErrorResponse()

    object AuthError {
        class MFAStepRequired(val ticket: String, val allowedMethods: List<String>) : ErrorResponse()
    }
}