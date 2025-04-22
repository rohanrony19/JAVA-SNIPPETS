package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Company;

public class Organization {
    private Company company;

    public Organization(Company company){
        this.company=company;
        System.out.println("Assigning company instance");
    }
    public void Clients(){
        if(this.company!=null){
            System.out.println("Running Client in organization");
        }else{
            System.out.println("Null");
        }
    }
}
