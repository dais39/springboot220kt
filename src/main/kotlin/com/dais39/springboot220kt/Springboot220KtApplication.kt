package com.dais39.springboot220kt

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class Springboot220KtApplication

fun main(args: Array<String>) {
    runApplication<Springboot220KtApplication>(*args)
}

@ConstructorBinding
@ConfigurationProperties(prefix = "sample")
class SampleConfig(
    val foo: String,
    val bar: String
)

@Component
class SampleLauncher(private val config: SampleConfig) : CommandLineRunner {

    override fun run(vararg args: String?) {

        println(config.foo)
        println(config.bar)
    }
}
