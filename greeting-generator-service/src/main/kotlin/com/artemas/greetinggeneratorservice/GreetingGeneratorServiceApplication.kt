package com.artemas.greetinggeneratorservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class GreetingGeneratorServiceApplication

fun main(args: Array<String>) {
    runApplication<GreetingGeneratorServiceApplication>(*args)
}
