package com.company.task3.models;

public class Marshmallow extends Sweet {

    private String colour;

    public Marshmallow(String name, int price, int weight) {
        super(name, price, weight);
    }

    public Marshmallow(String name, int price, int weight, String colour) {
        super(name, price, weight);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
