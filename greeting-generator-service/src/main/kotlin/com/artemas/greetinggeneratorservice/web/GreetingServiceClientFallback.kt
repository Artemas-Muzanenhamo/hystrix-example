package com.artemas.greetinggeneratorservice.web

import org.springframework.stereotype.Component

@Component
class GreetingServiceClientFallback: GreetingServiceClient {
    override fun generatorGreeting(name: String): Greeting {
        return Greeting("Hello $name! From Hystrix Fallback")
    }
}
