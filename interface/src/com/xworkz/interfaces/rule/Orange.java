package com.xworkz.interfaces.rule;

public interface Orange {
    void isCitrus();
    void hasVitaminC();
    void isRound();
    default void fruit(){
        System.out.println("fruit");
    }
}
