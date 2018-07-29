package com.joaorock.lineup.bands.model;

import java.util.List;

/**
 * Created by Lucas on 21/07/2018.
 */
public class CountryDTO {
    private Integer id;
    private String name;
    private String continent;
    private String language;
    private List<CityDTO> cities;

    public CountryDTO() {
    }

    public CountryDTO(Integer id, String name, String continent, String language, List<CityDTO> cities) {
        this.id = id;
        this.name = name;
        this.continent = continent;
        this.language = language;
        this.cities = cities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<CityDTO> getCities() {
        return cities;
    }

    public void setCities(List<CityDTO> cities) {
        this.cities = cities;
    }
}
