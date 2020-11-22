package com.artemas.greetinggeneratorservice.web

import feign.hystrix.FallbackFactory
import org.springframework.stereotype.Component

@Component
class GreetingServiceClientFallbackFactory: FallbackFactory<GreetingServiceClient> {
//    override fun generatorGreeting(name: String): Greeting {
//        return Greeting("Hello $name! From Hystrix Fallback 😂😂😂")
//    }

    override fun create(cause: Throwable?): GreetingServiceClient {
         return object : GreetingServiceClient {
             override fun generatorGreeting(name: String): Greeting {
                 return Greeting("Hello $name! From Hystrix Fallback. Reason for fallback is: $cause")
             }
         }
    }
}
