package com.jenac.hellokafka.controller

import com.jenac.hellokafka.service.Producer
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kafka")
class KafkaController(val producer: Producer) {
    @PostMapping("/messages", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun sendMessage(@RequestBody message: String) : ResponseEntity<String>{
        producer.sendMessage(message)
        return ResponseEntity.ok("KK")
    }

}