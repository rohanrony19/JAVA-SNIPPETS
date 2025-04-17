package com.xworkz.interfaces.rule;

public class Like implements Leave, Mars {

    @Override
    public void apply() {
        System.out.println("Like: Applying for leave.");
    }

    @Override
    public void approve() {
        System.out.println("Like: Leave has been approved.");
    }

    @Override
    public void reject() {
        System.out.println("Like: Leave application has been rejected.");
    }

    @Override
    public void isRedPlanet() {
        System.out.println("Like: Mars is known as the Red Planet.");
    }

    @Override
    public void hasDustStorms() {
        System.out.println("Like: Mars experiences massive dust storms.");
    }

    @Override
    public void hasMountains() {
        System.out.println("Like: Mars has the tallest volcano in the solar system.");
    }

    @Override
    public void planet() {
        System.out.println("Like:Mars is Rotating");
    }
}
