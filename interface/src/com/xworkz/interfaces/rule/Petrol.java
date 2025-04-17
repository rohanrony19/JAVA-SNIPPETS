package com.xworkz.interfaces.rule;

public interface Petrol {
    void fill();
    void burn();
    void checkLevel();
    default void money(){
        System.out.println("money");
    }
}
