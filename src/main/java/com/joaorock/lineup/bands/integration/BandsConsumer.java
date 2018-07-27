package com.joaorock.lineup.bands.integration;

import example.avro.Band;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BandsConsumer {

    private static final String TOPIC = "band-topic";
    private static final String GROUP = "band_group_id";

    /* when the application has more than
       1 schema types is necessary to set
       the containerFactory in order to read the
       according avro schema */
    @KafkaListener(topics =  TOPIC, group = GROUP, containerFactory = "kafkaListenerContainerFactoryBand")
    public void consume(Band band) {
        System.out.println("Consumed message: " + band.toString());
    }

}
