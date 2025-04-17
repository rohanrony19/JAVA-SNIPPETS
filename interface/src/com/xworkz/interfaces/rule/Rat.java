package com.xworkz.interfaces.rule;

public class Rat implements Orange, People {

    @Override
    public void isCitrus() {
        System.out.println("Rat is described as citrus-like for its tangy behavior.");
    }

    @Override
    public void hasVitaminC() {
        System.out.println("Rat, like an orange, is full of vitamin C energy.");
    }

    @Override
    public void isRound() {
        System.out.println("Rat is round like a juicy orange.");
    }

    @Override
    public void talk() {
        System.out.println("Rat talks in squeaky tones like people.");
    }

    @Override
    public void walk() {
        System.out.println("Rat walks quickly just like people in a hurry.");
    }

    @Override
    public void help() {
        System.out.println("Rat helps other rats by sharing food.");
    }

    @Override
    public void dull() {
        System.out.println("Rat is a Jerry");
    }
}
