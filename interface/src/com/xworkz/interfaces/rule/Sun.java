package com.xworkz.interfaces.rule;

public interface Sun {
    void rise();
    void set();
    void giveLight();
    default void bright(){
        System.out.println("bright");
    }
}
