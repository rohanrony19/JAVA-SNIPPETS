package com.xworkz.interfaces.rule;

public interface Ponds {
    void smoothSkin();
    void glow();
    void freshFeel();
    default void cream(){
        System.out.println("cream");
    }
}
