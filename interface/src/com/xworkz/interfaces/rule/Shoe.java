package com.xworkz.interfaces.rule;

public interface Shoe {
    void wear();
    void polish();
    void walk();
    default void size(){
        System.out.println("size");
    }
}
