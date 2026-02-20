package dev.thecampground

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import dev.thecampground.dev.thecampground.flukt.FluktClient
import kotlinx.coroutines.runBlocking

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val client = FluktClient()

    println(jacksonObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(client))
}