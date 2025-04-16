package com.xworkz.inheritancetypes.hybrid;

interface Dryer {
    void dryClothes();
}

interface Timer {
    void setTimer();
}

class Machine {
    void run() { System.out.println("Machine running"); }
}

class WashingMachine extends Machine implements Dryer, Timer {
    public void dryClothes() { System.out.println("Drying clothes"); }
    public void setTimer() { System.out.println("Timer set"); }
}
