package com.xworkz.interfaces.rule;

public class Art implements AC, Airoplain, Alien, Attendance, Carrot {

    @Override
    public void coolRoom() {
        System.out.println("Art: Cooling the room.");
    }

    @Override
    public void setTemperature() {
        System.out.println("Art: Setting the temperature.");
    }

    @Override
    public void swing() {
        System.out.println("Art: The AC is swinging.");
    }

    @Override
    public void costly() {
        System.out.println("costly: Running");
    }

    @Override
    public void fly() {
        System.out.println("Art: The airplane is flying.");
    }

    @Override
    public void land() {
        System.out.println("Art: The airplane is landing.");
    }

    @Override
    public void carryPassengers() {
        System.out.println("Art: Carrying passengers in the airplane.");
    }

    @Override
    public void comeFromSpace() {
        System.out.println("Art: Alien is coming from space.");
    }

    @Override
    public void hasBigEyes() {
        System.out.println("Art: Alien has big eyes.");
    }

    @Override
    public void communicate() {
        System.out.println("Art: Alien is communicating.");
    }

    @Override
    public void markPresent() {
        System.out.println("Art: Marking attendance as present.");
    }

    @Override
    public void isLate() {
        System.out.println("Art: The student is late.");
    }

    @Override
    public void calculatePercentage() {
        System.out.println("Art: Calculating attendance percentage.");
    }

    @Override
    public void isHealthy() {
        System.out.println("Art: The carrot is healthy.");
    }

    @Override
    public void usedInSalad() {
        System.out.println("Art: Carrot is used in salad.");
    }

    @Override
    public void hasVitaminA() {
        System.out.println("Art: Carrot has vitamin A.");
    }
}
