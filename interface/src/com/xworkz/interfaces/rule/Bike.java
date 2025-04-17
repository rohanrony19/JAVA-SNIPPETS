package com.xworkz.interfaces.rule;

public interface Bike {
    void start();
    void ride();
    void stop();
    default void wheel(){
        System.out.println("wheel");
    }
}
