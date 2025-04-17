package com.xworkz.interfaces.rule;

public interface Moon {
    void glow();
    void reflectSunlight();
    void appearAtNight();
    default void light(){
        System.out.println("light");
    }
}
