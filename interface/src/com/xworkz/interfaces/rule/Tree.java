package com.xworkz.interfaces.rule;

public class Tree implements Alien, Bet, Barbie, Battery, Bluetooth {

    @Override
    public void unpair() {
        System.out.println("Tree: Bluetooth device unpaired.");
    }

    @Override
    public void sendFile() {
        System.out.println("Tree: Bluetooth is sending a file.");
    }

    @Override
    public void pairDevice() {
        System.out.println("Tree: Bluetooth device paired.");
    }

    @Override
    public void lose() {
        System.out.println("Tree: Bet is lost.");
    }

    @Override
    public void win() {
        System.out.println("Tree: Bet is won.");
    }

    @Override
    public void place() {
        System.out.println("Tree: Placing a bet.");
    }

    @Override
    public void isRechargeable() {
        System.out.println("Tree: Battery is rechargeable.");
    }

    @Override
    public void discharge() {
        System.out.println("Tree: Battery is discharging.");
    }

    @Override
    public void storePower() {
        System.out.println("Tree: Battery is storing power.");
    }

    @Override
    public void play() {
        System.out.println("Tree: Barbie is playing.");
    }

    @Override
    public void talk() {
        System.out.println("Tree: Barbie is talking.");
    }

    @Override
    public void dressUp() {
        System.out.println("Tree: Barbie is being dressed up.");
    }

    @Override
    public void communicate() {
        System.out.println("Tree: Alien is communicating.");
    }

    @Override
    public void hasBigEyes() {
        System.out.println("Tree: Alien has big eyes.");
    }

    @Override
    public void comeFromSpace() {
        System.out.println("Tree: Alien came from space.");
    }
}
