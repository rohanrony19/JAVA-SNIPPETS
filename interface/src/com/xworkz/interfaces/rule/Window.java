package com.xworkz.interfaces.rule;

public interface Window {
    void open();
    void close();
    void allowAir();
    default void light(){
        System.out.println("light");
    }
}
