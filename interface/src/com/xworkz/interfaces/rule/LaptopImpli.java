package com.xworkz.interfaces.rule;

public class LaptopImpli implements Laptop {
    @Override
    public void powerOn() {
        System.out.println("Laptop is powered on");
    }

    @Override
    public void runPrograms() {
        System.out.println("Laptop is running programs");
    }

    @Override
    public void shutDown() {
        System.out.println("Laptop shutting down");
    }
}
