package com.xworkz.interfaces.rule;

public interface Drama {
    void act();
    void direct();
    void rehearse();
    default void good(){
        System.out.println("good");
    }
}
