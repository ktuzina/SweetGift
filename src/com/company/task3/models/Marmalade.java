package com.company.task3.models;

public class Marmalade extends Sweet {

    private String flavour;

    public Marmalade(String name, int price, int weight) {
        super(name, price, weight);
    }

    public Marmalade(String name, int price, int weight, String flavour) {
        super(name, price, weight);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
