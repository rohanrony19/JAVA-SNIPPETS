package com.xworkz.interfaces.rule;

public interface Library {
    void open();
    void issueBook();
    void close();
    default void good(){
        System.out.println("good");
    }
}
