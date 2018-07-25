package com.joaorock.lineup.bands.integration;

import example.avro.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CityProducer {
    @Autowired
    private KafkaTemplate<String, City> kafkaTemplate;

    private static final String TOPIC = "city-topic";

    public void publishCity(City city){
        kafkaTemplate.send(TOPIC, city);
    }
}
