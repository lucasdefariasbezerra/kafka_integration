package com.joaorock.lineup.bands.integration;

import com.google.gson.Gson;
import com.joaorock.lineup.bands.model.Band;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BandsConsumer {

    private static final String TOPIC = "bands_topic";
    private static final String GROUP = "group_id";

    @KafkaListener(topics =  TOPIC, group = GROUP)
    public void consume(String message) {
        Gson json = new Gson();
        Band band = json.fromJson(message,Band.class);
        System.out.println("Consumed message: " + band.toString());
    }

}
