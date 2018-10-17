package com.company.task3.comparators;

import com.company.task3.models.Sweet;

import java.util.Comparator;

public class PriceComparator implements Comparator<Sweet> {
    @Override
    public int compare(Sweet o1, Sweet o2) {
        return (int) Math.ceil(o2.getPrice() - o1.getPrice());
    }
}
