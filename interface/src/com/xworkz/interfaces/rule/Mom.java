package com.xworkz.interfaces.rule;

public class Mom implements Laptop, Leave, Library, Lotion, Kid {

    @Override
    public void play() {
        System.out.println("Mom: Kid is playing.");
    }

    @Override
    public void learn() {
        System.out.println("Mom: Kid is learning.");
    }

    @Override
    public void eat() {
        System.out.println("Mom: Kid is eating.");
    }

    @Override
    public void child() {
        System.out.println("Mom:Child is crying");
    }

    @Override
    public void powerOn() {
        System.out.println("Mom: Laptop is powered on.");
    }

    @Override
    public void runPrograms() {
        System.out.println("Mom: Laptop is running programs.");
    }

    @Override
    public void shutDown() {
        System.out.println("Mom: Laptop is shutting down.");
    }

    @Override
    public void apply() {
        System.out.println("Mom: Leave application is being applied.");
    }

    @Override
    public void approve() {
        System.out.println("Mom: Leave application is approved.");
    }

    @Override
    public void reject() {
        System.out.println("Mom: Leave application is rejected.");
    }

    @Override
    public void open() {
        System.out.println("Mom: Library is open.");
    }

    @Override
    public void issueBook() {
        System.out.println("Mom: Book is issued from the library.");
    }

    @Override
    public void close() {
        System.out.println("Mom: Library is closed.");
    }

    @Override
    public void protectSkin() {
        System.out.println("Mom: Lotion is protecting skin.");
    }

    @Override
    public void moisturize() {
        System.out.println("Mom: Lotion is moisturizing.");
    }
}
