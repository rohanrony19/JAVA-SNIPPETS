package com.xworkz.inheritancetypes.hybrid;

interface BatteryOperated {
    void charge();
}

interface Adjustable {
    void adjustSpeed();
}

class Tool {
    void use() { System.out.println("Using tool"); }
}

class PowerDrill extends Tool implements BatteryOperated, Adjustable {
    public void charge() { System.out.println("Charging power drill"); }
    public void adjustSpeed() { System.out.println("Adjusting drill speed"); }
}
