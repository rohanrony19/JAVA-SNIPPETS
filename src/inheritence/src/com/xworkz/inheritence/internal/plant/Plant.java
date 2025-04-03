package com.xworkz.inheritence.internal.plant;

public class Plant {
    public Plant() {
        System.out.println("Running non-arg constructor Plant");
    }
    public void grow() {
        System.out.println("Plant grows");
    }
    public void photosynthesis() {
        System.out.println("Plant performs photosynthesis");
    }
    public void absorbWater() {
        System.out.println("Plant absorbs water");
    }
    public void provideOxygen() {
        System.out.println("Plant provides oxygen");
    }
    public void reproduce() {
        System.out.println("Plant reproduces");
    }
}
