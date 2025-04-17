package com.xworkz.interfaces.rule;

public class Arun implements TV, Temple, Train, Tomato, Trolley {

    // TV Methods
    @Override
    public void powerOn() {
        System.out.println("Arun: Powering on the TV.");
    }

    @Override
    public void changeChannel() {
        System.out.println("Arun: Changing the TV channel.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Arun: Increasing the TV volume.");
    }

    // Temple Methods
    @Override
    public void openGate() {
        System.out.println("Arun: Opening the temple gate.");
    }

    @Override
    public void performPuja() {
        System.out.println("Arun: Performing Puja in the temple.");
    }

    @Override
    public void ringBell() {
        System.out.println("Arun: Ringing the temple bell.");
    }

    // Tomato Methods
    @Override
    public void isRed() {
        System.out.println("Arun: Tomato is red.");
    }

    @Override
    public void juicy() {
        System.out.println("Arun: Tomato is juicy.");
    }

    @Override
    public void usedInCurry() {
        System.out.println("Arun: Tomato is used in curry.");
    }

    // Train Methods
    @Override
    public void run() {
        System.out.println("Arun: Train is running.");
    }

    @Override
    public void stop() {
        System.out.println("Arun: Train is stopping.");
    }

    @Override
    public void horn() {
        System.out.println("Arun: Train horn is sounding.");
    }

    // Trolley Methods
    @Override
    public void roll() {
        System.out.println("Arun: Trolley is rolling.");
    }

    @Override
    public void carry() {
        System.out.println("Arun: Trolley is carrying items.");
    }

    @Override
    public void store() {
        System.out.println("Arun: Storing items in the trolley.");
    }
}
