package com.xworkz.interfaces.rule;

public class Pop implements Mars, Modhi {

    @Override
    public void isRedPlanet() {
        System.out.println("Pop represents Mars, the red planet.");
    }

    @Override
    public void hasDustStorms() {
        System.out.println("Pop as Mars has massive dust storms.");
    }

    @Override
    public void hasMountains() {
        System.out.println("Pop as Mars has the tallest mountains in the solar system.");
    }

    @Override
    public void planet() {
        System.out.println("Pop is a Method");
    }

    @Override
    public void leadCountry() {
        System.out.println("Pop as Modhi leads the country with strong leadership.");
    }

    @Override
    public void speak() {
        System.out.println("Pop as Modhi delivers a powerful speech.");
    }

    @Override
    public void visitState() {
        System.out.println("Pop as Modhi visits a state for development review.");
    }
}
