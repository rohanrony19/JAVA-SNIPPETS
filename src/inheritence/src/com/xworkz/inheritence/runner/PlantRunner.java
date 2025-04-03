package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.plant.Plant;
import com.xworkz.inheritence.internal.plant.Flower;

public class PlantRunner {
    public static void main(String[] args) {
        Plant plant = new Flower();
        plant.grow();
        plant.photosynthesis();
        plant.absorbWater();
        plant.provideOxygen();
        plant.reproduce();

        System.out.println("-----------");

        Flower flower = new Flower();
        flower.grow();
        flower.photosynthesis();
        flower.absorbWater();
        flower.provideOxygen();
        flower.reproduce();
    }
}
