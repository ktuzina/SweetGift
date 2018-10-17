package com.company.task3.main;

import com.company.task3.comparators.PriceComparator;
import com.company.task3.models.Chocolate;
import com.company.task3.models.Gift;
import com.company.task3.models.Marmalade;
import com.company.task3.models.Marshmallow;

import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean repeat = true;

        Gift gift = new Gift();
        gift.addSweet(new Chocolate("Alenka", 1, 3, true));
        gift.addSweet(new Chocolate("Burenka", 5, 4, false));
        gift.addSweet(new Marmalade("Lemon", 2, 5, "lemon"));
        gift.addSweet(new Marmalade("Orange", 4, 6, "orange"));
        gift.addSweet(new Marshmallow("Sky", 6, 2, "blue"));
        gift.addSweet(new Marshmallow("Sun", 3, 4, "yellow"));

        while (repeat) {
            System.out.println("1. show gift and count weight");
            System.out.println("2. sort");
            System.out.println("3. find");
            System.out.println("0. exit");

            Scanner sc = new Scanner(System.in);
            int action = sc.nextInt();

            switch (action) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.println(gift.printGift());
                    System.out.println("Counted weight = " + gift.countWeight() + "\n");
                    break;
                case 2:
                    Collections.sort(gift.getSweets(), new PriceComparator());
                    System.out.println(gift.printGift());
                    break;
                case 3:
                    System.out.println("Type price:");
                    int findPrice = new Scanner(System.in).nextInt();
                    System.out.println("Type weight:");
                    int findWeight = new Scanner(System.in).nextInt();
                    System.out.println(gift.findSweet(findPrice, findWeight));
                    break;
                default:
                    break;
            }
        }
    }
}
