package com.xworkz.interfaces.rule;

public class Transfer implements TV, Truck {

    @Override
    public void powerOn() {
        System.out.println("Transfer: Turning on the TV to watch content.");
    }

    @Override
    public void changeChannel() {
        System.out.println("Transfer: Changing the TV channel to another show.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Transfer: Increasing the volume for better sound.");
    }

    @Override
    public void load() {
        System.out.println("Transfer: Loading goods into the truck for transport.");
    }

    @Override
    public void transport() {
        System.out.println("Transfer: Transporting the goods to the destination.");
    }

    @Override
    public void unload() {
        System.out.println("Transfer: Unloading the goods after reaching the destination.");
    }
}
