package com.jenac.hellokafka.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service



@Service
class Producer {
    @Autowired
    private val kafkaTemplate: KafkaTemplate<String, String?>? = null
    fun sendMessage(message: String?) {
        Producer.Companion.logger.info(String.format("#### -> Producing message -> %s", message))
        kafkaTemplate!!.send(Producer.Companion.TOPIC, message)
    }

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(Producer::class.java)
        private const val TOPIC = "users"
    }
}