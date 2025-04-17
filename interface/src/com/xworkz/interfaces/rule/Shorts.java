package com.xworkz.interfaces.rule;

public class Shorts implements Bag, Barbie {

    @Override
    public void closeJip() {
        System.out.println("Closing the zip of the shorts.");
    }

    @Override
    public void keepSafe() {
        System.out.println("Keeping the shorts safe in the wardrobe.");
    }

    @Override
    public void size() {
        System.out.println("The size of the shorts is medium.");
    }

    @Override
    public void dressUp() {
        System.out.println("Dressing up the Barbie with shorts.");
    }

    @Override
    public void talk() {
        System.out.println("Barbie with shorts is talking.");
    }

    @Override
    public void play() {
        System.out.println("Barbie is playing while wearing shorts.");
    }
}
