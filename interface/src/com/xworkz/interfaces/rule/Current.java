package com.xworkz.interfaces.rule;

public interface Current {
    void flow();
    void shock();
    void lightUp();
    default void volt(){
        System.out.println("volt");
    }
}
