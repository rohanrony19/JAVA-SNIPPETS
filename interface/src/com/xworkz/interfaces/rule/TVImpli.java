package com.xworkz.interfaces.rule;

public class TVImpli implements TV {
    @Override
    public void powerOn() {
        System.out.println("TV is powering on");
    }

    @Override
    public void changeChannel() {
        System.out.println("Changing TV channel");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing TV volume");
    }
}
