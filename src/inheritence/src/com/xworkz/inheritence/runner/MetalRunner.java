package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.metal.Metal;
import com.xworkz.inheritence.internal.metal.Gold;

public class MetalRunner {
    public static void main(String[] args) {
        Metal metal = new Gold();
        metal.conductivity();
        metal.durability();
        metal.malleability();
        metal.density();
        metal.corrosion();

        System.out.println("-----------");

        Gold gold = new Gold();
        gold.conductivity();
        gold.durability();
        gold.malleability();
        gold.density();
        gold.corrosion();
    }
}
