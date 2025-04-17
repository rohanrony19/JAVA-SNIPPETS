package com.xworkz.interfaces.rule;

public class DramaImpli implements Drama {
    @Override
    public void act() {
        System.out.println("Acting in drama");
    }

    @Override
    public void direct() {
        System.out.println("Directing drama");
    }

    @Override
    public void rehearse() {
        System.out.println("Rehearsing drama");
    }

    @Override
    public void good() {
        System.out.println("drama is good");
    }
}
