package com.xworkz.interfaces.rule;

public class StarImpli implements Star {
    @Override
    public void shine() {
        System.out.println("Star is shining");
    }

    @Override
    public void twinkle() {
        System.out.println("Star is twinkling");
    }

    @Override
    public void visibleAtNight() {
        System.out.println("Star is visible at night");
    }

    @Override
    public void planet() {
        System.out.println("star");
    }
}
