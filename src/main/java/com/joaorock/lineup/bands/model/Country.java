package com.joaorock.lineup.bands.model;

import java.util.List;

/**
 * Created by Lucas on 21/07/2018.
 */
public class Country {
    private Integer id;
    private String name;
    private List<City> cities;

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

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
