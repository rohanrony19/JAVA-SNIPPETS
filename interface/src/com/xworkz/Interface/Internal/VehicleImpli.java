package com.xworkz.Interface.Internal;

public class VehicleImpli implements Vehicle{
    public VehicleImpli(){
        System.out.println("NO arg constructor in vehicleimpli");
    }

    @Override
    public void move() {
        System.out.println("overriding move in vehicleimpli");
    }
}
