package com.xworkz.interfaces.rule;

public class Towel implements Silver, Temple {

    @Override
    public void usedInUtensils() {
        System.out.println("Towel: Used to clean utensils after cooking.");
    }

    @Override
    public void polish() {
        System.out.println("Towel: Polishing silverware to make it shine.");
    }

    @Override
    public void reflectLight() {
        System.out.println("Towel: Reflecting light when hung in a bright room.");
    }

    @Override
    public void openGate() {
        System.out.println("Towel: Opening the gate of the temple for devotees.");
    }

    @Override
    public void performPuja() {
        System.out.println("Towel: Used to clean the area during a temple puja.");
    }

    @Override
    public void ringBell() {
        System.out.println("Towel: Ringing the temple bell during a prayer ceremony.");
    }
}
