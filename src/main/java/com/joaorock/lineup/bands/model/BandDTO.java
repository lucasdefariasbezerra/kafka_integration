package com.joaorock.lineup.bands.model;

public class BandDTO {

    private String name;
    private String style;
    private Double value;

    public BandDTO() {
    }

    public BandDTO(String name, String style, Double value) {
        this.name = name;
        this.style = style;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BandDTO{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", value=" + value +
                '}';
    }
}
