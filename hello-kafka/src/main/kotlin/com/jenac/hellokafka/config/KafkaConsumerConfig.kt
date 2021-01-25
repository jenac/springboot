package com.jenac.hellokafka.config

import com.jenac.hellokafka.model.Greeting
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.serialization.StringDeserializer
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
import org.springframework.kafka.listener.adapter.RecordFilterStrategy
import org.springframework.kafka.support.serializer.JsonDeserializer


//@EnableKafka
//@Configuration
class KafkaConsumerConfig {

//    @Value(value = "\${kafka.bootstrapAddress}")
//    private val bootstrapAddress: String? = null
//
//    @Bean
//    fun consumerFactory(): ConsumerFactory<String, String>  {
//        val props: MutableMap<String, Any> = HashMap()
//        props[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] =  bootstrapAddress!!
//        props[ConsumerConfig.GROUP_ID_CONFIG] = "foo"
//        props[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
//        props[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
//        return DefaultKafkaConsumerFactory(props)
//    }
//
//    fun kafkaListenerContainerFactory(groupId: String): ConcurrentKafkaListenerContainerFactory<String, String> {
//        val factory = ConcurrentKafkaListenerContainerFactory<String, String>()
//        factory.consumerFactory = consumerFactory()
//        return factory
//    }
//
//    @Bean
//    fun fooKafkaListenerContainerFactory(): ConcurrentKafkaListenerContainerFactory<String, String> {
//        return kafkaListenerContainerFactory(("foo"))
//    }

//    @Bean
//    fun barKafkaListenerContainerFactory(): ConcurrentKafkaListenerContainerFactory<String, String> {
//        return kafkaListenerContainerFactory(("bar"))
//    }
//
//    @Bean
//    fun headersKafkaListenerContainerFactory(): ConcurrentKafkaListenerContainerFactory<String, String> {
//        return kafkaListenerContainerFactory(("headers"))
//    }
//
//    @Bean
//    fun partitionsKafkaListenerContainerFactory(): ConcurrentKafkaListenerContainerFactory<String, String> {
//        return kafkaListenerContainerFactory(("partitions"))
//    }
//
//    @Bean
//    fun filterKafkaListenerContainerFactory(): ConcurrentKafkaListenerContainerFactory<String, String> {
//        val factory: ConcurrentKafkaListenerContainerFactory<String, String> =
//                kafkaListenerContainerFactory("filter")
//
//        factory.setRecordFilterStrategy(RecordFilterStrategy { record: ConsumerRecord<String, String> ->
//            record.value()
//                    .contains("World")
//        })
//        return factory
//    }

//    fun greetingConsumerFactory(): ConsumerFactory<String, Greeting> {
//        val props: MutableMap<String, Any> = HashMap()
//        props[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = bootstrapAddress!!
//        props[ConsumerConfig.GROUP_ID_CONFIG] = "greeting"
//        return DefaultKafkaConsumerFactory(props, StringDeserializer(), JsonDeserializer(Greeting::class.java))
//    }
//
//    @Bean
//    fun greetingKafkaListenerContainerFactory(): ConcurrentKafkaListenerContainerFactory<String, Greeting> {
//        val factory: ConcurrentKafkaListenerContainerFactory<String, Greeting>  =
//                ConcurrentKafkaListenerContainerFactory()
//        factory.consumerFactory = greetingConsumerFactory()
//        return factory
//    }

}