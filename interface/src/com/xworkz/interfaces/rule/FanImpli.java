package com.xworkz.interfaces.rule;

public class FanImpli implements Fan {
    @Override
    public void rotate() {
        System.out.println("Fan is rotating");
    }

    @Override
    public void coolAir() {
        System.out.println("Fan blows cool air");
    }

    @Override
    public void changeSpeed() {
        System.out.println("Fan speed changed");
    }

    @Override
    public void must() {
        System.out.println("fan is must");
    }
}
