package com.xworkz.Interface.Internal;

public class CarImpli implements Car{
    public CarImpli(){
        System.out.println("No arg constructor CarImpli");
    }
    @Override
    public void modify() {
        System.out.println("Overiding modify in CarImpli");
    }
}
