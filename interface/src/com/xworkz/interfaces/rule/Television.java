package com.xworkz.interfaces.rule;

public class Television implements Alien, Attendance {
    @Override
    public void comeFromSpace() {
        System.out.println("Television is coming from space.");
    }

    @Override
    public void hasBigEyes() {
        System.out.println("Television has big eyes like an alien.");
    }

    @Override
    public void communicate() {
        System.out.println("Television communicates with viewers.");
    }

    @Override
    public void markPresent() {
        System.out.println("Television is marked present.");
    }

    @Override
    public void isLate() {
        System.out.println("Television is not late.");
    }

    @Override
    public void calculatePercentage() {
        System.out.println("Television calculates attendance percentage.");
    }
}
