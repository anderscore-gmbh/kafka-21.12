package com.anderscore;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SpringConsumer {

    @KafkaListener(topics = "gfuHello")
    public void processMessage(String content) {
        System.out.println("Got message: "+ content);
    }
}
