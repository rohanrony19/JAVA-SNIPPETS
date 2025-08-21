package com.xworkz.External;

import com.xworkz.Service.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {

    Portfolio portfolio01 = getPortfolio();

    }

    private static Portfolio getPortfolio() {

        Chancellor chancelor1 = new Chancellor("rupa", 41, "davangere", 20000);
        Chancellor chancelor2 = new Chancellor("rodu", 44, "shimoga", 30000);

        University university01 = new University("Pes", "Shimoga", 123456, "Yogesh", chancelor1);
        University university02 = new University("Jnn", "Shimoga", 133221, "Lokesh", chancelor2);


        Education education1 = new Education(1, 100000, "vtu", "eee", university01);
        Education education2 = new Education(1, 100000, "vtu", "eee", university02);

        Detail detail1 = new Detail("raju", 21, "puin", 10000, education1);
        Detail detail2 = new Detail("raju", 21, "puin", 10000, education2);

        Staff staff1 = new Staff("yogi", 30, "Cleaner", 10000, detail1);
        Staff staff2 = new Staff("Sagar", 30, "Cleaner", 10000, detail2);

        List<Staff> staffs1 = new ArrayList<>();
        staffs1.add(staff1);
        staffs1.add(staff2);

        HeadOfDepartment headOfDepartment1 =
                new HeadOfDepartment("Arjun",38,"cse","arjun@gmail.com",staffs1);
        HeadOfDepartment headOfDepartment2
                = new HeadOfDepartment("Rajesh",36,"ise","rajesh@gmail.com",staffs1);

        Department department1 = new Department("cse",8,10,"arjun",headOfDepartment1);
       // Department department2 = new Department("ise",6,8,"prasanna",headOfDepartment2);

        Portfolio portfolio1 = new Portfolio("rohan",8,"portfolio.com","BE",department1);




        return portfolio1;

    }


}


