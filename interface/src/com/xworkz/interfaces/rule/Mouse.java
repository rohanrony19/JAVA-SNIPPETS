package com.xworkz.interfaces.rule;

public class Mouse implements AC, Airoplain {

    @Override
    public void coolRoom() {
        System.out.println("Cooling room");
    }

    @Override
    public void setTemperature() {
        System.out.println("Setting AC temperature");
    }

    @Override
    public void swing() {
        System.out.println("Swinging the fan");
    }

    @Override
    public void fly() {
        System.out.println("Mouse is flying like an airplane");
    }

    @Override
    public void land() {
        System.out.println("Mouse is landing like an airplane");
    }

    @Override
    public void carryPassengers() {
        System.out.println("Mouse is carrying passengers");
    }
}
