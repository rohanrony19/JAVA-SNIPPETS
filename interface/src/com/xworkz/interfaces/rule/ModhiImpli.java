package com.xworkz.interfaces.rule;

public class ModhiImpli implements Modhi {
    @Override
    public void leadCountry() {
        System.out.println("Modhi is leading the country");
    }

    @Override
    public void speak() {
        System.out.println("Modhi is speaking");
    }

    @Override
    public void visitState() {
        System.out.println("Modhi is visiting a state");
    }

    @Override
    public void pm() {
        System.out.println("modhi is pm");
    }
}
