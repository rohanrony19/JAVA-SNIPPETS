package com.xworkz.interfaces.rule;

public class Rotate implements AC, Airoplain, Alien, Attendance, Bag {

    @Override
    public void coolRoom() {
        System.out.println("Rotate: Cooling the room.");
    }

    @Override
    public void setTemperature() {
        System.out.println("Rotate: Setting the AC temperature.");
    }

    @Override
    public void swing() {
        System.out.println("Rotate: Swing mode enabled.");
    }

    @Override
    public void costly() {
        System.out.println("Rotate: Your heap");
    }

    @Override
    public void fly() {
        System.out.println("Rotate: Airoplain is flying.");
    }

    @Override
    public void land() {
        System.out.println("Rotate: Airoplain is landing.");
    }

    @Override
    public void carryPassengers() {
        System.out.println("Rotate: Airoplain is carrying passengers.");
    }

    @Override
    public void comeFromSpace() {
        System.out.println("Rotate: Alien has come from space.");
    }

    @Override
    public void hasBigEyes() {
        System.out.println("Rotate: Alien has big eyes.");
    }

    @Override
    public void communicate() {
        System.out.println("Rotate: Alien is communicating.");
    }

    @Override
    public void markPresent() {
        System.out.println("Rotate: Attendance is marked present.");
    }

    @Override
    public void isLate() {
        System.out.println("Rotate: Marked as late.");
    }

    @Override
    public void calculatePercentage() {
        System.out.println("Rotate: Calculating attendance percentage.");
    }

    @Override
    public void closeJip() {
        System.out.println("Rotate: Bag zip closed.");
    }

    @Override
    public void keepSafe() {
        System.out.println("Rotate: Items kept safe inside the bag.");
    }

    @Override
    public void size() {
        System.out.println("Rotate: Checking the bag size.");
    }
}
