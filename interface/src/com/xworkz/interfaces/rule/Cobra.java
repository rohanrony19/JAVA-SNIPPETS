package com.xworkz.interfaces.rule;

public class Cobra implements People, Petrol, Platinum, Pluto, Truck {

    @Override
    public void talk() {
        System.out.println("Cobra: People are talking.");
    }

    @Override
    public void walk() {
        System.out.println("Cobra: People are walking.");
    }

    @Override
    public void help() {
        System.out.println("Cobra: People help each other.");
    }

    @Override
    public void dull() {
        System.out.println("cobra: Petrol is in the tank");
    }

    @Override
    public void fill() {
        System.out.println("Cobra: Petrol is being filled.");
    }

    @Override
    public void burn() {
        System.out.println("Cobra: Petrol is burning to produce energy.");
    }

    @Override
    public void checkLevel() {
        System.out.println("Cobra: Checking petrol level.");
    }

    @Override
    public void rareMetal() {
        System.out.println("Cobra: Platinum is a rare metal.");
    }

    @Override
    public void usedInRings() {
        System.out.println("Cobra: Platinum is used in rings.");
    }

    @Override
    public void doesNotTarnish() {
        System.out.println("Cobra: Platinum does not tarnish easily.");
    }

    @Override
    public void revolve() {
        System.out.println("Cobra: Pluto revolves around the Sun.");
    }

    @Override
    public void rotate() {
        System.out.println("Cobra: Pluto is rotating on its axis.");
    }

    @Override
    public void hasIce() {
        System.out.println("Cobra: Pluto has icy surface.");
    }

    @Override
    public void planet() {
        System.out.println("Cobra:Truck is carries petrol");
    }

    @Override
    public void load() {
        System.out.println("Cobra: Truck is being loaded.");
    }

    @Override
    public void transport() {
        System.out.println("Cobra: Truck is transporting goods.");
    }

    @Override
    public void unload() {
        System.out.println("Cobra: Truck is being unloaded.");
    }
}
