package com.xworkz.interfaces.rule;

public interface Tomato {
    void isRed();
    void juicy();
    void usedInCurry();
    default void vegetable(){
        System.out.println("vegetable");
    }
}
