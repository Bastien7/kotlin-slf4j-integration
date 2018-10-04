package com.klogger.demo

import com.klogger.demo.service.DemoService
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinLoggerDemoApplication

fun main(args: Array<String>) {
    //runApplication<KotlinLoggerDemoApplication>(*args)

    //Run the demo
    val demoService = DemoService()

    demoService.methodWithInfo()
    demoService.methodWithWarning()
    demoService.methodWithError()
}
