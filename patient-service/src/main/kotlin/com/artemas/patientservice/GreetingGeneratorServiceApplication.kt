package com.artemas.patientservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GreetingGeneratorServiceApplication

fun main(args: Array<String>) {
    runApplication<GreetingGeneratorServiceApplication>(*args)
}
