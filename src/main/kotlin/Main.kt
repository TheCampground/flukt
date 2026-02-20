package dev.thecampground

import dev.thecampground.dev.thecampground.flukt.FluktClient
import org.slf4j.LoggerFactory

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
suspend fun main() {
    val logger = LoggerFactory.getLogger("Main")
    val client = FluktClient.create {
        token = System.getenv("flukt_token")
    }


    client.self.getSelf()
// Access the data reactively
//    client.instance.data.collect { info ->
//        println("Connected to Fluxer Instance: ${info?.endpoints?.api ?: "Connecting..."}")
//    }

    // client.auth.loginAsUser("test@example.com", "mypassword")
}