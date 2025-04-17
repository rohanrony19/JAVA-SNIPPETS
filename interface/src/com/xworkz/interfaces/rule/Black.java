package com.xworkz.interfaces.rule;

public class Black implements Bottle, Bottom {

    @Override
    public void fill() {
        System.out.println("Black bottle is being filled with water.");
    }

    @Override
    public void pour() {
        System.out.println("Black bottle is pouring its contents smoothly.");
    }

    @Override
    public void isReusable() {
        System.out.println("Black bottle is eco-friendly and reusable.");
    }

    @Override
    public void sitOn() {
        System.out.println("Black bottom is sturdy enough to sit on.");
    }

    @Override
    public void balance() {
        System.out.println("Black bottom provides balance to the structure.");
    }

    @Override
    public void support() {
        System.out.println("Black bottom supports everything placed on it.");
    }
}
