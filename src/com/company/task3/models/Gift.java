package com.company.task3.models;

import java.util.ArrayList;
import java.util.List;

public class Gift {

    private List<Sweet> sweets;

    public Gift() {
        this.sweets = new ArrayList<>();
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public void addSweet(Sweet candy) {
        sweets.add(candy);
    }

    public int countWeight() {
        int count = 0;
        for (Sweet candy : sweets) {
            count += candy.getWeight();
        }
        return count;
    }

    public String printGift() {
        String str = "";
        System.out.println("List of sweets in gift (name/price/weight):");
        for (Sweet candy : sweets) {
            str += candy.getInfo();
        }
        return str;
    }

    public String findSweet(int price, int weight) {
        for (Sweet candy : sweets) {
            if ((candy.getPrice() == price) && (candy.getWeight() == weight)) {
                return candy.getName();
            }
        }
        return "There is no such sweet";
    }
}
