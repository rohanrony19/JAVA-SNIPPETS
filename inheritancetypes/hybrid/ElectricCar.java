package com.xworkz.inheritancetypes.hybrid;

interface Rechargeable {
    void recharge();
}

interface EcoFriendly {
    void reduceEmissions();
}

class Vehicle {
    void move() { System.out.println("Vehicle is moving"); }
}

class ElectricCar extends Vehicle implements Rechargeable, EcoFriendly {
    public void recharge() { System.out.println("Electric car recharging"); }
    public void reduceEmissions() { System.out.println("Reducing emissions"); }
}
