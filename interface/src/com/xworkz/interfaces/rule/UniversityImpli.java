package com.xworkz.interfaces.rule;

public class UniversityImpli implements University {
    @Override
    public void conductExam() {
        System.out.println("University is conducting exams");
    }

    @Override
    public void publishResults() {
        System.out.println("University is publishing results");
    }

    @Override
    public void grantDegrees() {
        System.out.println("University is granting degrees");
    }

    @Override
    public void place() {
        System.out.println("university is a place");
    }
}
