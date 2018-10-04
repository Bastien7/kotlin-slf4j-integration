package com.klogger.demo.service

import com.klogger.demo.utils.Loggable
import org.springframework.stereotype.Component

/**
 * Simple service that triggers some logs
 */
@Component
class DemoService : Loggable {

    fun methodWithInfo() = log.info("Here is the information")

    fun methodWithWarning() = log.warn("Take care, this is a warning...")

    fun methodWithError() = log.error("Oh no, error happened!")
}