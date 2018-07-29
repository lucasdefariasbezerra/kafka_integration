package com.joaorock.lineup.bands.integration;

import example.avro.City;
import example.avro.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CountryProducer {
    @Autowired
    private KafkaTemplate<String, Country> kafkaTemplate;

    private static final String TOPIC = "country-topic";

    public void publishCountry(Country country){
        kafkaTemplate.send(TOPIC, country);
    }
}
