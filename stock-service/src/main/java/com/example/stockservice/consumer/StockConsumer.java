package com.example.stockservice.consumer;

import com.example.basedomain.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StockConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(StockConsumer.class);

    @KafkaListener(topics = "order_topics", groupId = "stock")
    public void consume(OrderEvent orderEvent){
        LOGGER.info(String.format("Order received from stock services-> %s", orderEvent));
    }
}
