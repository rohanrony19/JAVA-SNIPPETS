package com.xworkz.interfaces.rule;

public interface Truck {
    void load();
    void transport();
    void unload();
    default void carry(){
        System.out.println("carry");
    }
}
