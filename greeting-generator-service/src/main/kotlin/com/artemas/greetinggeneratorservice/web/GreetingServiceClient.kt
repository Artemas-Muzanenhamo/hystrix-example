package com.artemas.greetinggeneratorservice.web

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(value = "greetingServiceClient", fallbackFactory = GreetingServiceClientFallbackFactory::class)
interface GreetingServiceClient {
    @GetMapping("/api/greeting/{name}", produces = [APPLICATION_JSON_VALUE])
    fun generatorGreeting(@PathVariable name: String): Greeting
}
