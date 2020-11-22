package com.artemas.greetingservice.patient

import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class GreetingEndpoint {
    @GetMapping("/greeting/{name}", produces = [APPLICATION_JSON_VALUE])
    fun generatorGreeting(@PathVariable name: String): Greeting {
        return Greeting("Hello and welcome $name!!")
    }
}

