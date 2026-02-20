package dev.thecampground.dev.thecampground.flukt.core

import app.fluxer.client.NetworkResult
import app.fluxer.client.WellKnownFluxerClient
import app.fluxer.models.WellKnownFluxerResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.slf4j.LoggerFactory

class InstanceManagerInternal(private val api: WellKnownFluxerClient) {
    private val logger = LoggerFactory.getLogger(this::class.java)
    private val _data = MutableStateFlow<WellKnownFluxerResponse?>(null)
    val data = _data.asStateFlow()

    suspend fun refresh() {
        logger.trace("refresh")
        when(val res = api.getWellKnownFluxer()) {
            is NetworkResult.Success -> {
                logger.debug("Got instance info: {}", res.data)
                _data.value = res.data
            }
            else -> {
                throw IllegalStateException("Failed to connect to Fluxer: $res")
            }
        }
    }
}