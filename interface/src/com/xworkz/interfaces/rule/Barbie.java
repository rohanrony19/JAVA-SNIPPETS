package com.xworkz.interfaces.rule;

public interface Barbie {
    void dressUp();
    void talk();
    void play();

    default void fav(){
        System.out.println("fav");
    }
}
