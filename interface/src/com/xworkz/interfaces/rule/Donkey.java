package com.xworkz.interfaces.rule;

public class Donkey implements Current, Leave, Laptop, Ponds, Pluto {

    @Override
    public void flow() {
        System.out.println("Donkey: Current is flowing through wires.");
    }

    @Override
    public void shock() {
        System.out.println("Donkey: Current gives a shock.");
    }

    @Override
    public void lightUp() {
        System.out.println("Donkey: Current lights up the bulb.");
    }

    @Override
    public void powerOn() {
        System.out.println("Donkey: Laptop is powering on.");
    }

    @Override
    public void runPrograms() {
        System.out.println("Donkey: Laptop is running programs.");
    }

    @Override
    public void shutDown() {
        System.out.println("Donkey: Laptop is shutting down.");
    }

    @Override
    public void apply() {
        System.out.println("Donkey: Leave application submitted.");
    }

    @Override
    public void approve() {
        System.out.println("Donkey: Leave approved.");
    }

    @Override
    public void reject() {
        System.out.println("Donkey: Leave rejected.");
    }

    @Override
    public void revolve() {
        System.out.println("Donkey: Pluto revolves around the sun.");
    }

    @Override
    public void rotate() {
        System.out.println("Donkey: Pluto is rotating.");
    }

    @Override
    public void hasIce() {
        System.out.println("Donkey: Pluto has surface ice.");
    }

    @Override
    public void planet() {
        System.out.println("Donkey:Pluto is last planet");
    }

    @Override
    public void smoothSkin() {
        System.out.println("Donkey: Ponds cream gives smooth skin.");
    }

    @Override
    public void glow() {
        System.out.println("Donkey: Ponds cream makes the skin glow.");
    }

    @Override
    public void freshFeel() {
        System.out.println("Donkey: Ponds cream provides a fresh feel.");
    }
}
