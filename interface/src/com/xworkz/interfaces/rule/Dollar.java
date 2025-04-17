package com.xworkz.interfaces.rule;

public interface Dollar {
    void exchange();
    void convert();
    void value();
    default void money(){
        System.out.println("money");
    }
}
