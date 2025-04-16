package com.xworkz.interfaces.rule;

public class GodImpli implements God {
    @Override
    public void bless() {
        System.out.println("God blesses all");
    }

    @Override
    public void forgive() {
        System.out.println("God forgives sins");
    }

    @Override
    public void guide() {
        System.out.println("God guides people");
    }
}
