package com.learn.controller;

import com.learn.service.KafkaProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
@Slf4j
public class KafkaController {
    @Autowired
    private KafkaProducerService kafkaService;

    @PutMapping("/create/message")
    public ResponseEntity<?> createMessage(@RequestHeader(name = "message")
                                               final String message) {
        kafkaService.createMessage(message);
        return ResponseEntity.ok().body("Message created");
    }
}
