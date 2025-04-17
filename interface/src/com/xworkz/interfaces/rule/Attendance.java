package com.xworkz.interfaces.rule;

public interface Attendance {
    void markPresent();
    void isLate();
    void calculatePercentage();
    default void mandatory(){
        System.out.println("mandatory");
    }
}
