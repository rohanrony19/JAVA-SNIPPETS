package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.Vehicle;
import com.xworkz.Interface.Internal.VehicleImpli;

public class Audi {
    private Vehicle vehicle;

    public Audi(Vehicle vehicle){
        this.vehicle=vehicle;
        System.out.println("Assigning vehicle instance ");
    }
    public void rise(){
        if(this.vehicle!=null){
            this.vehicle.move();
            System.out.println("Running rise in audi");
        }else{
            System.out.println("Null");
        }
    }
}
