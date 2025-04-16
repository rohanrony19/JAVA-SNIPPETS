package com.xworkz.inheritancetypes.hybrid;

interface ElectricPowered {
    void turnOnLights();
}

interface WaterConnected {
    void supplyWater();
}

class Building {
    void construct() { System.out.println("Building constructed"); }
}

class House extends Building implements ElectricPowered, WaterConnected {
    public void turnOnLights() { System.out.println("Lights turned on"); }
    public void supplyWater() { System.out.println("Water being supplied"); }
}
