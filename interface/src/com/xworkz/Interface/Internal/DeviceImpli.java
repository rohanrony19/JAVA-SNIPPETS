package com.xworkz.Interface.Internal;

public class DeviceImpli implements Device{
    public DeviceImpli() {
        System.out.println("No arg constructor Laptop");
    }

    @Override
    public void start() {
        System.out.println("Overriding start in Laptop");
    }
}
