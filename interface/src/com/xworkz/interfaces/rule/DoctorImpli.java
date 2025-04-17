package com.xworkz.interfaces.rule;

public class DoctorImpli implements Doctor {
    @Override
    public void diagnose() {
        System.out.println("Doctor is diagnosing the patient");
    }

    @Override
    public void prescribe() {
        System.out.println("Doctor is prescribing medicines");
    }

    @Override
    public void performSurgery() {
        System.out.println("Doctor performing surgery");
    }

    @Override
    public void human() {
        System.out.println("doctor is a human");
    }
}
