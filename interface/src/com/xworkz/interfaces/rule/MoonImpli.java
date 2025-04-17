package com.xworkz.interfaces.rule;

public class MoonImpli implements Moon {
    @Override
    public void glow() {
        System.out.println("Moon glows softly");
    }

    @Override
    public void reflectSunlight() {
        System.out.println("Moon reflects sunlight");
    }

    @Override
    public void appearAtNight() {
        System.out.println("Moon appears at night");
    }

    @Override
    public void light() {
        System.out.println("moon light");
    }
}
