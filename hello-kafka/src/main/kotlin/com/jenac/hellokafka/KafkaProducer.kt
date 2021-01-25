package com.jenac.hellokafka

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

//@Component
class KafkaProducer {
//    private val LOGGER: Logger = LoggerFactory.getLogger(KafkaProducer::class.java)
//
//    @Autowired
//    private val kafkaTemplate: KafkaTemplate<String, String>? = null
//
//    fun send(topic: String, payload: String) {
//        LOGGER.info("sending payload='$payload' to topic='$topic'")
//        kafkaTemplate!!.send(topic, payload)
//    }
}