package com.xworkz.interfaces.rule;

public class Fool implements Doctor, Dog {

    @Override
    public void diagnose() {
        System.out.println("Fool: Diagnosing the illness.");
    }

    @Override
    public void prescribe() {
        System.out.println("Fool: Prescribing the treatment.");
    }

    @Override
    public void performSurgery() {
        System.out.println("Fool: Performing the surgery.");
    }

    @Override
    public void bark() {
        System.out.println("Fool: Barking like a dog.");
    }

    @Override
    public void run() {
        System.out.println("Fool: Running around like a dog.");
    }

    @Override
    public void wagTail() {
        System.out.println("Fool: Wagging the tail like a dog.");
    }
}
