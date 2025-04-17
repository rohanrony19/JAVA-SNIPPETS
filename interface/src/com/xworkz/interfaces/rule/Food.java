package com.xworkz.interfaces.rule;

public class Food implements Dead, Dog, Doctor, Dollar, Drama {

    @Override
    public void remember() {
        System.out.println("Food: Remembering the dead.");
    }

    @Override
    public void bury() {
        System.out.println("Food: Burying the dead.");
    }

    @Override
    public void mourn() {
        System.out.println("Food: Mourning the dead.");
    }

    @Override
    public void diagnose() {
        System.out.println("Food: Doctor is diagnosing.");
    }

    @Override
    public void prescribe() {
        System.out.println("Food: Doctor is prescribing medicine.");
    }

    @Override
    public void performSurgery() {
        System.out.println("Food: Doctor is performing surgery.");
    }

    @Override
    public void bark() {
        System.out.println("Food: Dog is barking.");
    }

    @Override
    public void run() {
        System.out.println("Food: Dog is running.");
    }

    @Override
    public void wagTail() {
        System.out.println("Food: Dog is wagging its tail.");
    }

    @Override
    public void exchange() {
        System.out.println("Food: Dollar is being exchanged.");
    }

    @Override
    public void convert() {
        System.out.println("Food: Dollar is being converted.");
    }

    @Override
    public void value() {
        System.out.println("Food: Dollar has value.");
    }

    @Override
    public void act() {
        System.out.println("Food: Performing a drama act.");
    }

    @Override
    public void direct() {
        System.out.println("Food: Directing a drama.");
    }

    @Override
    public void rehearse() {
        System.out.println("Food: Rehearsing a drama.");
    }
}
