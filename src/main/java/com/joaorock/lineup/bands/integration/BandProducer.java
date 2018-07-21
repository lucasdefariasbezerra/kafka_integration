package com.joaorock.lineup.bands.integration;

import com.joaorock.lineup.bands.model.Band;
import com.joaorock.lineup.bands.utils.DataConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class BandProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "band_topic";

    public void publishBand(Band band){
        kafkaTemplate.send(TOPIC, DataConversion.getJson(band));
    }
}
