package com.xworkz.interfaces.rule;

public class SunImpli implements Sun {
    @Override
    public void rise() {
        System.out.println("Sun rises in the east");
    }

    @Override
    public void set() {
        System.out.println("Sun sets in the west");
    }

    @Override
    public void giveLight() {
        System.out.println("Sun gives light and heat");
    }
}
