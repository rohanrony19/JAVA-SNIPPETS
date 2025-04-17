package com.xworkz.interfaces.rule;

public class Cream implements Carrot, Chain {

    @Override
    public void isHealthy() {
        System.out.println("Cream: Healthy like a carrot.");
    }

    @Override
    public void usedInSalad() {
        System.out.println("Cream: Used in salads, but more commonly used as a topping.");
    }

    @Override
    public void hasVitaminA() {
        System.out.println("Cream: Has some vitamins, but not as much as a carrot.");
    }

    @Override
    public void lock() {
        System.out.println("Cream: Locking the flavor in a jar.");
    }

    @Override
    public void wear() {
        System.out.println("Cream: Wear it as a skin moisturizer.");
    }

    @Override
    public void shine() {
        System.out.println("Cream: Shining like a well-polished chain.");
    }
}
