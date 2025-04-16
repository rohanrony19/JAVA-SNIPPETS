package com.xworkz.interfaces.rule;

public class AttendanceImpli implements Attendance {
    @Override
    public void markPresent() {
        System.out.println("Marking attendance");
    }

    @Override
    public void isLate() {
        System.out.println("Student is late");
    }

    @Override
    public void calculatePercentage() {
        System.out.println("Calculating attendance percentage");
    }
}
