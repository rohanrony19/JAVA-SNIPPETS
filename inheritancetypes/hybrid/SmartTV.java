package com.xworkz.inheritancetypes.hybrid;

interface RemoteControl {
    void control();
}

interface InternetDevice {
    void connectInternet();
}

class Appliance {
    void power() { System.out.println("Appliance powered"); }
}

class SmartTV extends Appliance implements RemoteControl, InternetDevice {
    public void control() { System.out.println("Controlling TV remotely"); }
    public void connectInternet() { System.out.println("Connecting SmartTV to internet"); }
}
