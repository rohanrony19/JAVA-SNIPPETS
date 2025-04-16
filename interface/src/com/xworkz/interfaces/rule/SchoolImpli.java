package com.xworkz.interfaces.rule;

public class SchoolImpli implements School {
    @Override
    public void conductClass() {
        System.out.println("Conducting school class");
    }

    @Override
    public void giveHomework() {
        System.out.println("Giving homework to students");
    }

    @Override
    public void takeAttendance() {
        System.out.println("Taking school attendance");
    }
}
