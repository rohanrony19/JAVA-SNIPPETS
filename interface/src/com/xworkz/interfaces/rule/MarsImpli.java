package com.xworkz.interfaces.rule;

public class MarsImpli implements Mars {
    @Override
    public void isRedPlanet() {
        System.out.println("Mars is known as the Red Planet");
    }

    @Override
    public void hasDustStorms() {
        System.out.println("Mars has huge dust storms");
    }

    @Override
    public void hasMountains() {
        System.out.println("Mars has the tallest mountain in the solar system");
    }

    @Override
    public void planet() {
        System.out.println("mars is a planet");
    }
}
