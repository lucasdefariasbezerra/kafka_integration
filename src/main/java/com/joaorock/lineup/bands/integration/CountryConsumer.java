package com.joaorock.lineup.bands.integration;

import example.avro.City;
import example.avro.Country;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CountryConsumer {
    private static final String TOPIC = "country-topic";
    private static final String GROUP = "group_id";

    @KafkaListener(topics =  TOPIC, group = GROUP)
    public void consume(Country country) {
        System.out.println("Consumed message: "+ country.toString());
    }
}
