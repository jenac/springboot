package com.jenac.hellokafka.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.KafkaAdmin

import org.apache.kafka.clients.admin.AdminClientConfig
import org.apache.kafka.clients.admin.NewTopic


//@Configuration
class KafkaTopicConfig {
//    @Value(value = "\${kafka.bootstrapAddress}")
//    private val bootstrapAddress: String? = null
//
//    @Value(value ="\${message.topic.name}")
//    private val topicName: String? = null

//    @Value(value = "\${partitioned.topic.name}")
//    private val partitionedTopicName:String? = null
//
//    @Value(value = "\${filtered.topic.name}")
//    private val filteredTopicName: String? = null
//
//    @Value(value = "\${greeting.topic.name}")
//    private val greetingTopicName: String? = null

//    @Bean
//    fun kafkaAdmin(): KafkaAdmin {
//        val configs: MutableMap<String, Any> = HashMap()
//        configs[AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG] = bootstrapAddress!!
//        return KafkaAdmin(configs)
//    }
//
//    @Bean
//    fun topic1(): NewTopic {
//        return NewTopic(topicName, 1, 1.toShort())
//    }

//    @Bean
//    fun topic2(): NewTopic {
//        return NewTopic(partitionedTopicName, 6, 1.toShort())
//    }
//
//    @Bean
//    fun topic3(): NewTopic {
//        return NewTopic(filteredTopicName, 1, 1.toShort())
//    }
//
//    @Bean
//    fun topic4(): NewTopic {
//        return NewTopic(greetingTopicName, 1, 1.toShort())
//    }
}