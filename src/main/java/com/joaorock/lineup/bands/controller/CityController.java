package com.joaorock.lineup.bands.controller;

import com.joaorock.lineup.bands.integration.CityProducer;
import com.joaorock.lineup.bands.model.CityDTO;
import example.avro.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("city")
public class CityController {

    @Autowired
    CityProducer cityProducer;

    @PostMapping("/create")
    public String create(@RequestBody final CityDTO cityDTO) {
        City city = new City();
        city.setId(cityDTO.getId());
        city.setName(cityDTO.getName());
        cityProducer.publishCity(city);
        return "Published successfully";
    }
}
