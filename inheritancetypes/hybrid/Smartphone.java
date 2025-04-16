package com.xworkz.inheritancetypes.hybrid;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Device {
    void powerOn() { System.out.println("Device powered on"); }
}

class Smartphone extends Device implements Camera, MusicPlayer {
    public void takePhoto() { System.out.println("Smartphone taking photo"); }
    public void playMusic() { System.out.println("Smartphone playing music"); }
}



