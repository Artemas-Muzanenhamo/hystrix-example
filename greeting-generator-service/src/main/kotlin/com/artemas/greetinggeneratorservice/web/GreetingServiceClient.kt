package com.artemas.greetinggeneratorservice.web

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "greeting-service", fallback = GreetingServiceClientFallback::class)
interface GreetingServiceClient {
    @GetMapping("/api/greeting/{name}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun generatorGreeting(@PathVariable name: String): Greeting
}
