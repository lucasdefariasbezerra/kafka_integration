package com.joaorock.lineup.bands.util;

import com.joaorock.lineup.bands.model.CountryDTO;
import example.avro.City;
import example.avro.Country;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucas on 28/07/2018.
 */
public class AvroConverter {

    public static Country getAvroCountry(CountryDTO countryDto){
        Country country = new Country();
        country.setId(countryDto.getId());
        country.setContinent(countryDto.getContinent());
        country.setName(countryDto.getName());
        country.setLanguage(countryDto.getLanguage());
        List<City> cities = new ArrayList<>();
        countryDto.getCities().forEach(city -> {
            City cityAvro = new City();
            cityAvro.setId(city.getId());
            cityAvro.setName(city.getName());
            cityAvro.setIsCapital(city.getCapital());
            cities.add(cityAvro);
        });
        country.setCities(cities);
        return country;
    }
}
