package com.xworkz.interfaces.rule;

public class ChairImpli implements Chair {
    @Override
    public void sitOn() {
        System.out.println("You can sit on the chair");
    }

    @Override
    public void hasLegs() {
        System.out.println("Chair has four legs");
    }

    @Override
    public void isComfortable() {
        System.out.println("Chair is comfortable");
    }
}
