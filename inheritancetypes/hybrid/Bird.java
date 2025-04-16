package com.xworkz.inheritancetypes.hybrid;

interface Flyer {
    void fly();
}

interface Singer {
    void sing();
}

class Organism {
    void grow() { System.out.println("Organism growing"); }
}

class Bird extends Organism implements Flyer, Singer {
    public void fly() { System.out.println("Bird flying"); }
    public void sing() { System.out.println("Bird singing"); }
}
