package com.xworkz.interfaces.rule;

public class Umbrella implements Train, Trolley {

    @Override
    public void run() {
        System.out.println("Umbrella: Running through the rain, providing shelter.");
    }

    @Override
    public void stop() {
        System.out.println("Umbrella: Stopping from providing shelter as the rain stops.");
    }

    @Override
    public void horn() {
        System.out.println("Umbrella: Honking to alert people in the crowded area.");
    }

    @Override
    public void roll() {
        System.out.println("Umbrella: Rolling up after use to keep it compact.");
    }

    @Override
    public void carry() {
        System.out.println("Umbrella: Carrying the shelter wherever it's needed.");
    }

    @Override
    public void store() {
        System.out.println("Umbrella: Storing the umbrella in a safe place after use.");
    }
}
