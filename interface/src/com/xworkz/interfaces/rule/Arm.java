package com.xworkz.interfaces.rule;

public class Arm implements Vote, Bluetooth, Battery, Bag, Bottle {

    @Override
    public void closeJip() {
        System.out.println("Arm: Closing the zipper on the bag.");
    }

    @Override
    public void keepSafe() {
        System.out.println("Arm: Keeping the contents safe.");
    }

    @Override
    public void size() {
        System.out.println("Arm: Checking the size of the bag.");
    }

    @Override
    public void storePower() {
        System.out.println("Arm: Storing power in the battery.");
    }

    @Override
    public void discharge() {
        System.out.println("Arm: Discharging power from the battery.");
    }

    @Override
    public void isRechargeable() {
        System.out.println("Arm: Checking if the battery is rechargeable.");
    }

    @Override
    public void pairDevice() {
        System.out.println("Arm: Pairing the device with Bluetooth.");
    }

    @Override
    public void sendFile() {
        System.out.println("Arm: Sending file via Bluetooth.");
    }

    @Override
    public void unpair() {
        System.out.println("Arm: Unpairing the Bluetooth device.");
    }

    @Override
    public void fill() {
        System.out.println("Arm: Filling the bottle.");
    }

    @Override
    public void pour() {
        System.out.println("Arm: Pouring the contents from the bottle.");
    }

    @Override
    public void isReusable() {
        System.out.println("Arm: Checking if the bottle is reusable.");
    }

    @Override
    public void castVote() {
        System.out.println("Arm: Casting the vote.");
    }

    @Override
    public void verifyVoter() {
        System.out.println("Arm: Verifying the voter.");
    }

    @Override
    public void countVote() {
        System.out.println("Arm: Counting the votes.");
    }
}
