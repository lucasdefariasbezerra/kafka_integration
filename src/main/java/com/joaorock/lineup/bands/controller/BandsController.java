package com.joaorock.lineup.bands.controller;

import com.joaorock.lineup.bands.integration.BandProducer;
import com.joaorock.lineup.bands.model.Band;
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
    public String create(@RequestBody final Band band) {
        bandProducer.publishBand(band);
        return "Published successfully";
    }
}
