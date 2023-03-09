package com.example.emailservice.consumer;

import com.example.basedomain.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EmailConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmailConsumer.class);

    @KafkaListener(topics = "order_topics", groupId = "email")
    public void consume(OrderEvent orderEvent){
        LOGGER.info(String.format("Order received from email services-> %s", orderEvent));
    }
}
