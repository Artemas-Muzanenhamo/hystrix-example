package com.artemas.greetinggeneratorservice.web

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class GreetingGeneratorEndpoint(
        val greetingServiceClient: GreetingServiceClient
) {

    @GetMapping("/greet/{name}")
    fun generateGreetingBy(@PathVariable name: String): Greeting {
        return greetingServiceClient.generatorGreeting(name)
    }
}
