package com.joaorock.lineup.bands.controller;

import com.joaorock.lineup.bands.integration.BandProducer;
import com.joaorock.lineup.bands.model.BandDTO;
import example.avro.Band;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bands")
public class BandsController {

    @Autowired
    BandProducer bandProducer;


    @PostMapping("/create")
    public String create(@RequestBody final BandDTO band) {
        Band bandTopic = new Band();
        bandTopic.setName(band.getName());
        bandTopic.setStyle(band.getName());
        bandTopic.setValue(band.getValue());
        bandProducer.publishBand(bandTopic);
        return "Published successfully";
    }
}
