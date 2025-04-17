package com.xworkz.interfaces.rule;

public class FridgeImpli implements Fridge {
    @Override
    public void coolItems() {
        System.out.println("Fridge cools items");
    }

    @Override
    public void storeFood() {
        System.out.println("Fridge stores food");
    }

    @Override
    public void makeIce() {
        System.out.println("Fridge makes ice");
    }

    @Override
    public void things() {
        System.out.println("fridge is used to keep things");
    }
}
