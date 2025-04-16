package com.xworkz.interfaces.rule;

public class DogImpli implements Dog {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void wagTail() {
        System.out.println("Dog is wagging tail");
    }
}
