package com.xworkz.interfaces.rule;

public class Tool implements Saturn, Sun, Silver, Fan, Kid {

    @Override
    public void coolAir() {
        System.out.println("Tool: Fan is cooling the air.");
    }

    @Override
    public void changeSpeed() {
        System.out.println("Tool: Fan speed changed.");
    }

    @Override
    public void play() {
        System.out.println("Tool: Kid is playing.");
    }

    @Override
    public void learn() {
        System.out.println("Tool: Kid is learning.");
    }

    @Override
    public void eat() {
        System.out.println("Tool: Kid is eating.");
    }

    @Override
    public void child() {
        System.out.println("Tools:Technology");
    }

    @Override
    public void rotate() {
        System.out.println("Tool: Saturn is rotating.");
    }

    @Override
    public void hasRings() {
        System.out.println("Tool: Saturn has beautiful rings.");
    }

    @Override
    public void attractMoons() {
        System.out.println("Tool: Saturn is attracting moons.");
    }

    @Override
    public void usedInUtensils() {
        System.out.println("Tool: Silver is used in utensils.");
    }

    @Override
    public void polish() {
        System.out.println("Tool: Silver is being polished.");
    }

    @Override
    public void reflectLight() {
        System.out.println("Tool: Silver reflects light brightly.");
    }

    @Override
    public void rise() {
        System.out.println("Tool: Sun is rising in the east.");
    }

    @Override
    public void set() {
        System.out.println("Tool: Sun is setting in the west.");
    }

    @Override
    public void giveLight() {
        System.out.println("Tool: Sun is giving light to the Earth.");
    }
}
