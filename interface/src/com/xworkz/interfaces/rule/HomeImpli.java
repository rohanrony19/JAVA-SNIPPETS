package com.xworkz.interfaces.rule;

public class HomeImpli implements Home{
    @Override
    public void slipperOutSide() {
        System.out.println("slipperOutSide");
    }

    @Override
    public void sleepEarly() {
        System.out.println("sleepEarly");

    }

    @Override
    public boolean speakLoud() {
        System.out.println("speakLoud");
        return false;
    }
}
