package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.appliance.Appliance;
import com.xworkz.inheritence.internal.appliance.WashingMachine;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance = new WashingMachine();
        appliance.powerOn();
        appliance.powerOff();
        appliance.consumeElectricity();
        appliance.function();
        appliance.brand();

        System.out.println("-----------");

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.powerOn();
        washingMachine.powerOff();
        washingMachine.consumeElectricity();
        washingMachine.function();
        washingMachine.brand();
    }
}
