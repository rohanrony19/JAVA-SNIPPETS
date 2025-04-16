package com.xworkz.interfaces.rule;

public class HospitalImpli implements Hospital {
    @Override
    public void admitPatient() {
        System.out.println("Admitting patient to hospital");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Providing treatment");
    }

    @Override
    public void dischargePatient() {
        System.out.println("Discharging patient");
    }
}
