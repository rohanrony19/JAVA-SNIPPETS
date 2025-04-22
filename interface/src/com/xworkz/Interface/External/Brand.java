package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Car;
import com.xworkz.Interface.Internal.Icc;

public class Brand {
    private Car car;
    public Brand(Car car){
        this.car=car;
        System.out.println("Assigning car instance to current class");
    }

    public void race(){
        if(this.car!=null){
            this.car.modify();
            System.out.println("Running race in Brand");
        }else{
            System.out.println("null");
        }
    }
}


