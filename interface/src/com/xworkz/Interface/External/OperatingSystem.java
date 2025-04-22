package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Laptop;

public class OperatingSystem {
    protected Laptop laptop;

    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
        System.out.println("Assigning Laptop instance");
    }
    public void core(){
        if(this.laptop!=null){
            this.laptop.process();
            System.out.println("Running core in Operatingsystem");
        }else{
            System.out.println("Null");
        }

    }
}
