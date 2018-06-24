package com.joaorock.lineup.bands.model;

public class Band {

    private Integer id;
    private String name;
    private String style;
    private Double value;

    public Band() {
    }

    public Band(Integer id,String name, String style, Double value) {
        this.id = id;
        this.name = name;
        this.style = style;
        this.value = value;
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
        return "Band{" +
                "name='" + name + '\'' +
                ", style='" + style + '\'' +
                ", value=" + value +
                '}';
    }
}
