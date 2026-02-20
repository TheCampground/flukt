package dev.thecampground.dev.thecampground.flukt.common

sealed class ErrorResponse {
    class UnknownError : ErrorResponse()
    class NetworkError : ErrorResponse()

}