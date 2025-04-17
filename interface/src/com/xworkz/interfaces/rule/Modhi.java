package com.xworkz.interfaces.rule;

public interface Modhi {
    void leadCountry();
    void speak();
    void visitState();
    default void pm(){
        System.out.println("pm");
    }
}
