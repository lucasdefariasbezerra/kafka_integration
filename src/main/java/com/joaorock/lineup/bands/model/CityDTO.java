package com.joaorock.lineup.bands.model;

public class CityDTO {
    private Integer id;
    private String name;
    private boolean isCapital;

    public CityDTO() {
    }

    public CityDTO(Integer id, String name,Boolean isCapital) {
        this.id = id;
        this.name = name;
        this.isCapital = isCapital;
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

    public boolean getCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }
}
