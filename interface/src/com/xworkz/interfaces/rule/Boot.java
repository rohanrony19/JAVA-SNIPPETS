package com.xworkz.interfaces.rule;

public class Boot implements Bottle, Bag, Battery, Bet, Bike {

    @Override
    public void closeJip() {
        System.out.println("Boot: Closing the zipper on the bag.");
    }

    @Override
    public void keepSafe() {
        System.out.println("Boot: Keeping the contents safe inside the boot.");
    }

    @Override
    public void size() {
        System.out.println("Boot: Checking the size of the boot.");
    }

    @Override
    public void storePower() {
        System.out.println("Boot: Storing power in the battery.");
    }

    @Override
    public void discharge() {
        System.out.println("Boot: Discharging the battery.");
    }

    @Override
    public void isRechargeable() {
        System.out.println("Boot: Checking if the battery is rechargeable.");
    }

    @Override
    public void place() {
        System.out.println("Boot: Placing the boot in the right spot.");
    }

    @Override
    public void win() {
        System.out.println("Boot: The bet is won!");
    }

    @Override
    public void lose() {
        System.out.println("Boot: The bet is lost.");
    }

    @Override
    public void start() {
        System.out.println("Boot: Starting the bike.");
    }

    @Override
    public void ride() {
        System.out.println("Boot: Riding the bike.");
    }

    @Override
    public void stop() {
        System.out.println("Boot: Stopping the bike.");
    }

    @Override
    public void fill() {
        System.out.println("Boot: Filling the bottle.");
    }

    @Override
    public void pour() {
        System.out.println("Boot: Pouring the contents from the bottle.");
    }

    @Override
    public void isReusable() {
        System.out.println("Boot: Checking if the bottle is reusable.");
    }
}
