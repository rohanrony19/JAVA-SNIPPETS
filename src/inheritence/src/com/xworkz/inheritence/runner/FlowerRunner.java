package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.flower.Flower;
import com.xworkz.inheritence.internal.flower.Rose;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower flower = new Rose();
        flower.bloom();
        flower.fragrance();
        flower.color();
        flower.petals();
        flower.pollination();

        System.out.println("-----------");

        Rose rose = new Rose();
        rose.bloom();
        rose.fragrance();
        rose.color();
        rose.petals();
        rose.pollination();
    }
}
