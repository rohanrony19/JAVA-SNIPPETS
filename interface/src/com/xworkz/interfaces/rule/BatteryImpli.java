package com.xworkz.interfaces.rule;

public class BatteryImpli implements Battery {
    @Override
    public void storePower() {
        System.out.println("Battery stores electrical energy");
    }

    @Override
    public void discharge() {
        System.out.println("Battery discharges power");
    }

    @Override
    public void isRechargeable() {
        System.out.println("Battery is rechargeable");
    }

    @Override
    public void percentage() {
        System.out.println("charger to increase percentage");
    }
}
