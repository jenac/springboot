package com.jenac.hellokafka.service

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service
import java.io.IOException

@Service
class Consumer() {

    @KafkaListener(topics = ["\${app.topic.users}"], groupId = "\${app.consumer.groupid}")
    @Throws(IOException::class)
    fun consume(message: String)  {
        logger.info("### -> Consumed message -> $message")
    }
    companion object {
        private val logger: Logger = LoggerFactory.getLogger(Consumer::class.java)
    }
}

