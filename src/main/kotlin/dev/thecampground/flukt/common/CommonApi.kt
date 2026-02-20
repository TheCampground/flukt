package dev.thecampground.dev.thecampground.flukt.common

import io.ktor.client.HttpClient

interface CommonApi {
    val client: HttpClient
}
