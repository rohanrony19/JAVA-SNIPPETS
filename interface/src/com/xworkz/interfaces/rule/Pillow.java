package com.xworkz.interfaces.rule;

public class Pillow implements Money, Moon {

    @Override
    public void spend() {
        System.out.println("Pillow spends comfort all night.");
    }

    @Override
    public void save() {
        System.out.println("Pillow saves your dreams with care.");
    }

    @Override
    public void invest() {
        System.out.println("Pillow invests in good sleep and relaxation.");
    }

    @Override
    public void glow() {
        System.out.println("Pillow glows softly like the moonlight.");
    }

    @Override
    public void reflectSunlight() {
        System.out.println("Pillow reflects the morning sun from the window.");
    }

    @Override
    public void appearAtNight() {
        System.out.println("Pillow appears every night for restful sleep.");
    }
}
