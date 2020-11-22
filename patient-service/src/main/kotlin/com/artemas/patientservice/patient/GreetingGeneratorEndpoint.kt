package com.artemas.patientservice.patient

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class GreetingGeneratorEndpoint(val greetingGeneratorService: GreetingGeneratorService) {

    @PostMapping("/greet")
    fun retrievePatientInformation(name: String): Greeting {
        return greetingGeneratorService.generateGreetingWith(name)
    }
}
