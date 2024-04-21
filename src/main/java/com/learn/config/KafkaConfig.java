package com.learn.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

import static com.learn.helper.Constraints.MESSENGER;

@Configurable
public class KafkaConfig {
    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name(MESSENGER)
                .build();
    }
}
