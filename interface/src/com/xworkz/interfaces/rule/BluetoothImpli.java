package com.xworkz.interfaces.rule;

public class BluetoothImpli implements Bluetooth {
    @Override
    public void pairDevice() {
        System.out.println("Bluetooth pairing device");
    }

    @Override
    public void sendFile() {
        System.out.println("Bluetooth sending file");
    }

    @Override
    public void unpair() {
        System.out.println("Bluetooth unpaired device");
    }

    @Override
    public void connect() {
        System.out.println("bluetooth need to be connected");
    }
}
