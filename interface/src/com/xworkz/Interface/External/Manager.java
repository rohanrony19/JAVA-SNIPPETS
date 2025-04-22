package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.College;

public class Manager {
    private College college;

    public Manager(College college){
        this.college=college;
        System.out.println("Assigning College instance ");
    }
    public void stuff(){
        if(this.college!=null){
            this.college.students();
            System.out.println("Running stuff in Manager");
        }else{
            System.out.println("Null");
        }
    }
}
