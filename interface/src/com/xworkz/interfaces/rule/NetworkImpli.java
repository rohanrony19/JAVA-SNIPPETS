package com.xworkz.interfaces.rule;

public class NetworkImpli implements Network {
    @Override
    public void connect() {
        System.out.println("Network is connecting");
    }

    @Override
    public void transferData() {
        System.out.println("Transferring data through network");
    }

    @Override
    public void disconnect() {
        System.out.println("Network disconnected");
    }

    @Override
    public void speed() {
        System.out.println("network speed");
    }
}
