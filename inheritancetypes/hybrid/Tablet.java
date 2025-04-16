package com.xworkz.inheritancetypes.hybrid;

interface TouchScreen {
    void touch();
}

interface Reader {
    void read();
}

class Gadget {
    void boot() { System.out.println("Gadget booting"); }
}

class Tablet extends Gadget implements TouchScreen, Reader {
    public void touch() { System.out.println("Touch screen active"); }
    public void read() { System.out.println("Reading eBook"); }
}