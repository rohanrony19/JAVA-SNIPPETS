package com.xworkz.interfaces.rule;

public class SunflowerImpli implements Sunflower {
    @Override
    public void faceSun() {
        System.out.println("Sunflower faces the sun");
    }

    @Override
    public void produceSeeds() {
        System.out.println("Sunflower produces seeds");
    }

    @Override
    public void growTall() {
        System.out.println("Sunflower grows tall");
    }

    @Override
    public void flower() {
        System.out.println("flower");
    }
}
