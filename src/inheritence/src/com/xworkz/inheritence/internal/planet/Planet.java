package com.xworkz.inheritence.internal.planet;

public class Planet {
    public Planet() {
        System.out.println("Running non-arg constructor Planet");
    }
    public void orbitsSun() {
        System.out.println("Planet orbits the sun");
    }
    public void hasGravity() {
        System.out.println("Planet has gravity");
    }
    public void hasAtmosphere() {
        System.out.println("Planet has an atmosphere");
    }
    public void supportsLife() {
        System.out.println("Some planets support life");
    }
    public void hasOceans() {
        System.out.println("Some planets have oceans");
    }
}
