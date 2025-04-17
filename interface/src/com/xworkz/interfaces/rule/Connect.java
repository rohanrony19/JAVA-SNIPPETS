package com.xworkz.interfaces.rule;

public interface Connect {
    void establish();
    void maintain();
    void terminate();
    default void people(){
        System.out.println("people");
    }
}
