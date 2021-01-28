package com.example.kafka_01

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit
import kotlin.system.exitProcess


@SpringBootApplication
class Kafka01Application : CommandLineRunner {

	@Autowired
	private val template: KafkaTemplate<String, String>? = null

	private val latch = CountDownLatch(3)

	@Throws(Exception::class)
	override fun run(vararg args: String?) {
		this.template!!.send("myTopic", "foo1")
		this.template!!.send("myTopic", "foo2")
		this.template!!.send("myTopic", "foo3")
		latch.await(60, TimeUnit.SECONDS)
		logger.info("All received")
		exitProcess(0)
	}

	@KafkaListener(topics = ["myTopic"])
	@Throws(java.lang.Exception::class)
	open fun listen(cr: ConsumerRecord<*, *>) {
		logger.info("*** getting a message ->")
		logger.info(cr.toString())
		latch.countDown()
	}

	companion object {
		private val logger: Logger = LoggerFactory.getLogger(Kafka01Application::class.java)
	}
}

fun main(args: Array<String>) {
	runApplication<Kafka01Application>(*args)
}
