package com.xworkz.interfaces.rule;

public class BikeImpli implements Bike {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void ride() {
        System.out.println("Riding bike");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    public void wheel() {
        System.out.println("bike have wheels");
    }
}
