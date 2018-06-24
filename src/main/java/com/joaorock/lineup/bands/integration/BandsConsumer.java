package com.joaorock.lineup.bands.integration;

import com.google.gson.Gson;
import com.joaorock.lineup.bands.config.KafkaUtils;
import com.joaorock.lineup.bands.model.Band;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class BandsConsumer {


    @KafkaListener(topics = KafkaUtils.BANDS_TOPIC, group = KafkaUtils.GROUP)
    public void consume(String message) {
        Gson json = new Gson();
        Band band = json.fromJson(message,Band.class);
        System.out.println("Consumed message: " + band.toString());
    }

}
