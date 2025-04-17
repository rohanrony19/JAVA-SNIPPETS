package com.xworkz.interfaces.rule;

public interface Fan {
    void rotate();
    void coolAir();
    void changeSpeed();
    default void must(){
        System.out.println("must");
    }
}
