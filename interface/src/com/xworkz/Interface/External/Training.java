package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;
import com.xworkz.Interface.Internal.Internship;

public class Training {
    private Internship internship;

    public Training(Internship internship){
        this.internship=internship;
        System.out.println("Assigning internship instance ");
    }
    public void couching(){
        if(this.internship!=null){
            this.internship.stipend();
            System.out.println("Running stuff in Manager");
        }else{
            System.out.println("Null");
        }
    }
}
