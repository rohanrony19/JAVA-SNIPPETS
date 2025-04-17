package com.xworkz.interfaces.rule;

public interface Rose {
    void smell();
    void bloom();
    void hasThorns();
    default void flower(){
        System.out.println("flower");
    }
}
