package com.xworkz.Interface.Internal;

public class LaptopImpli implements Laptop{

    public LaptopImpli(){
        System.out.println("No arg Constructor");
    }
    @Override
    public void process() {
        System.out.println("overriding process in LaptopImpli");
    }
}
