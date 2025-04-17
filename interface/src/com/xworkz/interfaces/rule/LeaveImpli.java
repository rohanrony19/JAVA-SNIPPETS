package com.xworkz.interfaces.rule;

public class LeaveImpli implements Leave {
    @Override
    public void apply() {
        System.out.println("Leave applied");
    }

    @Override
    public void approve() {
        System.out.println("Leave approved");
    }

    @Override
    public void reject() {
        System.out.println("Leave rejected");
    }

    @Override
    public void take() {
        System.out.println("leave take");
    }
}
