package com.joaorock.lineup.bands.integration;

import example.avro.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BandProducer {

    @Autowired
    private KafkaTemplate<String, Band> kafkaTemplate;

    private static final String TOPIC = "band-topic";

    public void publishBand(Band band){
        kafkaTemplate.send(TOPIC, band);
    }
}
