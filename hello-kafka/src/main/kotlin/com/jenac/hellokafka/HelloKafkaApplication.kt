package com.jenac.hellokafka

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloKafkaApplication

fun main(args: Array<String>) {
	runApplication<HelloKafkaApplication>(*args)
}
