package com.joaorock.lineup.bands.integration;

import example.avro.City;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CityConsumer {
    private static final String TOPIC = "city-topic";
    private static final String GROUP = "group_id";

    @KafkaListener(topics =  TOPIC, group = GROUP)
    public void consume(City city) {
        System.out.println("Consumed message: ");
    }
}
