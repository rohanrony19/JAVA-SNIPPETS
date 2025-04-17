package com.xworkz.interfaces.rule;

public interface Bottle {
    void fill();
    void pour();
    void isReusable();
    default void water(){
        System.out.println("water");
    }
}
