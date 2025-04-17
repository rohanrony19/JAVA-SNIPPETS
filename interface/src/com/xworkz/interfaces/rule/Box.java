package com.xworkz.interfaces.rule;

public class Box implements Battery, Bjp {

    @Override
    public void storePower() {
        System.out.println("Box: Storing power in the battery.");
    }

    @Override
    public void discharge() {
        System.out.println("Box: Discharging power to devices.");
    }

    @Override
    public void isRechargeable() {
        System.out.println("Box: This battery is rechargeable.");
    }

    @Override
    public void winElection() {
        System.out.println("Box: Winning elections with strategic plans.");
    }

    @Override
    public void makeSpeech() {
        System.out.println("Box: Making speeches to appeal to the public.");
    }

    @Override
    public void launchScheme() {
        System.out.println("Box: Launching schemes for the betterment of society.");
    }
}
