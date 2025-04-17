package com.xworkz.interfaces.rule;

public class Engineering implements Current, Dead {

    @Override
    public void flow() {
        System.out.println("Engineering: Current flows through the wires.");
    }

    @Override
    public void shock() {
        System.out.println("Engineering: Getting a shock from the electrical current.");
    }

    @Override
    public void lightUp() {
        System.out.println("Engineering: Current lights up the bulb.");
    }

    @Override
    public void remember() {
        System.out.println("Engineering: Remembering the lessons from past experiences.");
    }

    @Override
    public void bury() {
        System.out.println("Engineering: Burying the dead with respect.");
    }

    @Override
    public void mourn() {
        System.out.println("Engineering: Mourning the loss of a loved one.");
    }
}
