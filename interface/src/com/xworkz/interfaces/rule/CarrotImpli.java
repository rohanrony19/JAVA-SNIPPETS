package com.xworkz.interfaces.rule;

public class CarrotImpli implements Carrot {
    @Override
    public void isHealthy() {
        System.out.println("Carrot is very healthy");
    }

    @Override
    public void usedInSalad() {
        System.out.println("Carrot used in salad");
    }

    @Override
    public void hasVitaminA() {
        System.out.println("Carrot contains Vitamin A");
    }
}
