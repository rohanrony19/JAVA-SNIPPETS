package com.xworkz.inheritence.internal.vehicle;

public class Vehicle {
    public Vehicle() {
        System.out.println("Running non-arg constructor Vehicle");
    }
    public void move() {
        System.out.println("Vehicle is moving");
    }
    public void stop() {
        System.out.println("Vehicle is stopping");
    }
    public void fuel() {
        System.out.println("Vehicle needs fuel");
    }
    public void speed() {
        System.out.println("Vehicle has speed");
    }
    public void transport() {
        System.out.println("Vehicle is used for transport");
    }
}
