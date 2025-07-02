package com.xworkz.service;

import com.xworkz.Repository.collegeRepository;
import com.xworkz.Repository.collegeRepositoryImpl;
import com.xworkz.dto.collegedto;

public class collegeApplicationImp implements collegeApplicationService{
 
    @Override
    public String collegeApplicationValidated(collegedto college) {
        System.out.println("-------------");
        if (college != null) {
            System.out.println("data is valid");
            collegeRepository collegerepo = new collegeRepositoryImpl();
            collegerepo.save(college);
            return "success";
        } else {
            System.out.println("validation failed");
            return "failed";
        }
    }
}
