package com.xworkz.inheritence.internal.appliance;

public class Appliance {
    public Appliance() {
        System.out.println("Running non-arg constructor Appliance");
    }
    public void powerOn() {
        System.out.println("Appliance is powered on");
    }
    public void powerOff() {
        System.out.println("Appliance is powered off");
    }
    public void consumeElectricity() {
        System.out.println("Appliance consumes electricity");
    }
    public void function() {
        System.out.println("Appliance performs a function");
    }
    public void brand() {
        System.out.println("Appliance has a brand");
    }
}
