package com.learn.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "messenger", groupId = "message-group")
    public void consumeMessage(final String message) {
        System.out.println(message);
    }
}
