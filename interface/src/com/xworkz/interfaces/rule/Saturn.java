package com.xworkz.interfaces.rule;

public interface Saturn {
    void rotate();
    void hasRings();
    void attractMoons();
    default void planet(){
        System.out.println("planet");
    }
}
