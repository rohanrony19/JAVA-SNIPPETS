package com.xworkz.interfaces.rule;

public class Leg implements Kid, Laptop {

    @Override
    public void play() {
        System.out.println("Leg: Playing a game, using my legs to run around.");
    }

    @Override
    public void learn() {
        System.out.println("Leg: Learning new skills by walking and exploring.");
    }

    @Override
    public void eat() {
        System.out.println("Leg: Eating food to keep my energy up for running and playing.");
    }

    @Override
    public void child() {
        System.out.println("Leg: Kids playing cricket");
    }

    @Override
    public void powerOn() {
        System.out.println("Leg: Powering on the laptop to get to work.");
    }

    @Override
    public void runPrograms() {
        System.out.println("Leg: Running programs on the laptop to process data.");
    }

    @Override
    public void shutDown() {
        System.out.println("Leg: Shutting down the laptop to conserve energy.");
    }
}
