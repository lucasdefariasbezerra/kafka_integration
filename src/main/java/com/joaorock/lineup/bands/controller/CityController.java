package com.joaorock.lineup.bands.controller;

import com.google.gson.Gson;
import com.joaorock.lineup.bands.integration.CountryProducer;
import com.joaorock.lineup.bands.model.CityDTO;
import com.joaorock.lineup.bands.model.CountryDTO;
import com.joaorock.lineup.bands.util.AvroConverter;
import example.avro.City;
import example.avro.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("city")
public class CityController {

    @Autowired
    CountryProducer countryProducer;

    @PostMapping("/create")
    public String create(@RequestBody final String payload) {
        CountryDTO countryDTO = new Gson().fromJson(payload,CountryDTO.class);
        Country country = AvroConverter.getAvroCountry(countryDTO);
        countryProducer.publishCountry(country);
        return "Published successfully";
    }
}
