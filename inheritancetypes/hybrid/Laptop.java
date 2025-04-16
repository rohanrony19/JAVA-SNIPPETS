package com.xworkz.inheritancetypes.hybrid;

interface Portable {
    void carry();
}

interface WiFiEnabled {
    void connectWiFi();
}

class Computer {
    void process() { System.out.println("Processing data"); }
}

class Laptop extends Computer implements Portable, WiFiEnabled {
    public void carry() { System.out.println("Carrying laptop"); }
    public void connectWiFi() { System.out.println("Connecting to WiFi"); }
}
