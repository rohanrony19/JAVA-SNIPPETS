package com.xworkz.interfaces.rule;

public class WindowImpli implements Window {
    @Override
    public void open() {
        System.out.println("Window opened");
    }

    @Override
    public void close() {
        System.out.println("Window closed");
    }

    @Override
    public void allowAir() {
        System.out.println("Window allows air flow");
    }
}
