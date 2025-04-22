package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Device;

public class User {
    private Device device;

    public User(Device device) {
        this.device = device;
        System.out.println("Assigning device instance to User");
    }

    public void operate() {
        if (this.device != null) {
            this.device.start();
            System.out.println("Operating device in User");
        } else {
            System.out.println("null");
        }
    }
}
