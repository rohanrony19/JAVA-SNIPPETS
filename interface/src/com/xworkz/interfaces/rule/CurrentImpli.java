package com.xworkz.interfaces.rule;

public class CurrentImpli implements Current {
    @Override
    public void flow() {
        System.out.println("Electric current is flowing");
    }

    @Override
    public void shock() {
        System.out.println("Current can give shock");
    }

    @Override
    public void lightUp() {
        System.out.println("Current lights up the room");
    }
}
