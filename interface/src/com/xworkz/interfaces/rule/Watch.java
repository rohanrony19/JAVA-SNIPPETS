package com.xworkz.interfaces.rule;

public interface Watch {
    void showTime();
    void setAlarm();
    void waterproof();
    default void time(){
        System.out.println("time");
    }
}
