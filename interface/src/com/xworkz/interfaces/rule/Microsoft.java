package com.xworkz.interfaces.rule;

public class Microsoft implements Home, HM {

    @Override
    public void design() {
        System.out.println("Microsoft is designing modern digital solutions.");
    }

    @Override
    public void trend() {
        System.out.println("Microsoft is setting tech trends globally.");
    }

    @Override
    public void sell() {
        System.out.println("Microsoft is selling enterprise software and hardware.");
    }

    @Override
    public void slipperOutSide() {
        System.out.println("At Microsoft home, slippers are kept outside.");
    }

    @Override
    public void sleepEarly() {
        System.out.println("Microsoft encourages work-life balance and early sleep.");
    }

    @Override
    public boolean speakLoud() {
        System.out.println("Speaking loudly is discouraged at Microsoft home.");
        return false;
    }
}
