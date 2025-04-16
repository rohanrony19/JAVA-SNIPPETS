package com.xworkz.interfaces.rule;

public class ACImpli implements AC {
    @Override
    public void coolRoom() {
        System.out.println("AC is cooling the room");
    }

    @Override
    public void setTemperature() {
        System.out.println("Setting AC temperature");
    }

    @Override
    public void swing() {
        System.out.println("AC swing mode on");
    }
}
