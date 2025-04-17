package com.xworkz.interfaces.rule;

public class TruckImpli implements Truck {
    @Override
    public void load() {
        System.out.println("Truck is loading items");
    }

    @Override
    public void transport() {
        System.out.println("Truck is transporting goods");
    }

    @Override
    public void unload() {
        System.out.println("Truck is unloading");
    }

    @Override
    public void carry() {
        System.out.println("truck carry");
    }
}
