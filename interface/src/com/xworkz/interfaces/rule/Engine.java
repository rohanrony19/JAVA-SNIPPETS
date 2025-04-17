package com.xworkz.interfaces.rule;

public interface Engine {
    void start();
    void consumeFuel();
    void stop();
    default void repair(){
        System.out.println("repair");
    }
}
