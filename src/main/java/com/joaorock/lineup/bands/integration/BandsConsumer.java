package com.joaorock.lineup.bands.integration;

import com.joaorock.lineup.bands.model.Band;
import com.joaorock.lineup.bands.utils.DataConversion;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BandsConsumer {

    private static final String TOPIC = "band_topic";
    private static final String GROUP = "group_id";

    @KafkaListener(topics =  TOPIC, group = GROUP)
    public void consume(String message) {
        Band band = DataConversion.getObject(message,Band.class);
        System.out.println("Consumed message: " + band.toString());
    }

}
