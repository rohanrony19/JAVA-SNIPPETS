package com.xworkz.interfaces.rule;

public interface Collage {
    void conductEvents();
    void provideHostel();
    void manageDepartments();
    default void pesitm(){
        System.out.println("pesitm");
    }
}
