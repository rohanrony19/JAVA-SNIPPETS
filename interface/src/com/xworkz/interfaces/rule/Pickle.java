package com.xworkz.interfaces.rule;

public class Pickle implements Bike, Bjp {

    @Override
    public void start() {
        System.out.println("Pickle bike is starting with flavor.");
    }

    @Override
    public void ride() {
        System.out.println("Riding the pickle bike through spice trails.");
    }

    @Override
    public void stop() {
        System.out.println("Pickle bike is stopping at the taste station.");
    }

    @Override
    public void winElection() {
        System.out.println("Pickle party wins the election with spicy manifestos.");
    }

    @Override
    public void makeSpeech() {
        System.out.println("Pickle representative makes a tangy speech.");
    }

    @Override
    public void launchScheme() {
        System.out.println("Pickle party launches a new flavor scheme.");
    }
}
