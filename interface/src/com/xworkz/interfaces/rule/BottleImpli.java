package com.xworkz.interfaces.rule;

public class BottleImpli implements Bottle {
    @Override
    public void fill() {
        System.out.println("Bottle is filled");
    }

    @Override
    public void pour() {
        System.out.println("Bottle pouring water");
    }

    @Override
    public void isReusable() {
        System.out.println("Bottle is reusable");
    }
}
