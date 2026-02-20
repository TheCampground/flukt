package dev.thecampground.dev.thecampground.flukt.api

import app.fluxer.client.AuthLoginClient
import app.fluxer.client.WellKnownFluxerClient
import org.koin.core.module.Module
import org.koin.dsl.module

fun createApiModule() = module {
    single { WellKnownFluxerClient(get()) }
    single { AuthLoginClient(get()) }
}