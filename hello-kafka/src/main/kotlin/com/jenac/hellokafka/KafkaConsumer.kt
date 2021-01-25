package com.jenac.hellokafka

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component
import java.util.concurrent.CountDownLatch
import org.apache.kafka.clients.consumer.ConsumerRecord




//@Component
class KafkaConsumer {
//    private val LOGGER: Logger = LoggerFactory.getLogger(KafkaConsumer::class.java)
//    val latch: CountDownLatch = CountDownLatch(1)
//    var payload: String = ""
//
//    @KafkaListener(topics = ["\${message.topic.name}"], groupId = "foo")
//    fun receive(consumerRecord: ConsumerRecord<*, *>) {
//        LOGGER.info("received payload='{}'", consumerRecord.toString())
//        payload = consumerRecord.toString()
//        latch.countDown()
//    }



}