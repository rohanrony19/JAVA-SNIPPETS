package com.xworkz.interfaces.rule;

public interface Chain {
    void lock();
    void wear();
    void shine();
    default void dog(){
        System.out.println("dog");
    }
}
