package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Constitution;

public class Government {
    private Constitution constitution;

    public Government(Constitution constitution){
        this.constitution=constitution;
        System.out.println("Assigning Constitution instance to government");
    }
    public void policy(){
        if(this.constitution!=null){
            this.constitution.followLaws();
            System.out.println("Running policy in Government");
        }else{
            System.out.println("Constitution is null");
        }

    }
}
