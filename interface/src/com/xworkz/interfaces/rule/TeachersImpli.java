package com.xworkz.interfaces.rule;

public class TeachersImpli implements Teachers {
    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }

    @Override
    public void evaluate() {
        System.out.println("Teacher is evaluating students");
    }

    @Override
    public void guideStudents() {
        System.out.println("Teacher is guiding students");
    }

    @Override
    public void strict() {
        System.out.println("teachers are strict");
    }
}
