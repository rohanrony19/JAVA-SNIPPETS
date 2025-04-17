package com.xworkz.interfaces.rule;

public class Spoon implements Rose, Saturn {

    @Override
    public void smell() {
        System.out.println("Spoon: Smelling like a rose.");
    }

    @Override
    public void bloom() {
        System.out.println("Spoon: Blooming like a rose.");
    }

    @Override
    public void hasThorns() {
        System.out.println("Spoon: A rose has thorns, but this is a spoon.");
    }

    @Override
    public void rotate() {
        System.out.println("Spoon: Rotating like Saturn.");
    }

    @Override
    public void hasRings() {
        System.out.println("Spoon: Saturn has rings, this spoon is part of a set.");
    }

    @Override
    public void attractMoons() {
        System.out.println("Spoon: Saturn attracts moons, this spoon attracts food.");
    }
}
