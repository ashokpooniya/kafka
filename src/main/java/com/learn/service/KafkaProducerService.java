package com.learn.service;

import com.learn.helper.Constraints;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducerService {
    @Autowired
    private KafkaTemplate<String, Object> producer;

    public void createMessage(final String message) {
        producer.send(Constraints.MESSENGER, message);
    }
}
