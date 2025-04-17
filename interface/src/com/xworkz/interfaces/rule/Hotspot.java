package com.xworkz.interfaces.rule;

public interface Hotspot {
    void turnOn();
    void connectDevice();
    void turnOff();
    default void connect(){
        System.out.println("connect");
    }
}
