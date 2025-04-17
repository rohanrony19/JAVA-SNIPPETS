package com.xworkz.interfaces.rule;

public class AlienImpli implements Alien {
    @Override
    public void comeFromSpace() {
        System.out.println("Alien comes from outer space");
    }

    @Override
    public void hasBigEyes() {
        System.out.println("Alien has big glowing eyes");
    }

    @Override
    public void communicate() {
        System.out.println("Alien communicates telepathically");
    }

    @Override
    public void ugly() {
        System.out.println("is Ugly");
    }
}
