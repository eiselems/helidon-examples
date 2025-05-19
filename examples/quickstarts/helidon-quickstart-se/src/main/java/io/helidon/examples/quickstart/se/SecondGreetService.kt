package io.helidon.examples.quickstart.se

import io.helidon.service.registry.Service
import io.helidon.webserver.http.*

interface TestService {
    fun test(test: String)
}

@Service.Singleton
class SecondGreetService() : TestService {
    override fun test(test: String) {
        println("test")
    }

}