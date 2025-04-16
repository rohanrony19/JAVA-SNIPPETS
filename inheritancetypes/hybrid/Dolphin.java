package com.xworkz.inheritancetypes.hybrid;

interface Swimmer {
    void swim();
}

interface Communicator {
    void communicate();
}

class Animal {
    void live() { System.out.println("Animal living"); }
}

class Dolphin extends Animal implements Swimmer, Communicator {
    public void swim() { System.out.println("Dolphin swimming"); }
    public void communicate() { System.out.println("Dolphin communicating"); }
}