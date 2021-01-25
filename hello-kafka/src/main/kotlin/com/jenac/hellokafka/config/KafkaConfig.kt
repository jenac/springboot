package com.jenac.hellokafka.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class KafkaConfig {
    @Value(value = "\${app.topic.users}")
    val topicNameUsers: String = "users_default"
}