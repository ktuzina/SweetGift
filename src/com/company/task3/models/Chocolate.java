package com.company.task3.models;

public class Chocolate extends Sweet {

    private boolean withNuts;

    public Chocolate(String name, int price, int weight) {
        super(name, price, weight);
    }

    public Chocolate(String name, int price, int weight, Boolean withNuts) {
        super(name, price, weight);
        this.withNuts = withNuts;
    }

    public Boolean getWithNuts() {
        return withNuts;
    }

    public void setWithNuts(Boolean withNuts) {
        this.withNuts = withNuts;
    }
}
