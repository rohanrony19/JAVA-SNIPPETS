package com.xworkz.interfaces.rule;

public interface Temple {
    void openGate();
    void performPuja();
    void ringBell();
    default void divine(){
        System.out.println("divine");
    }
}
