package com.repo.bigmac

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BigMacApplication

fun main(args: Array<String>) {
    runApplication<BigMacApplication>(*args)
}
