package com.xworkz.rohan.controller;

import com.xworkz.rohan.repository.SignUpRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
public class OpenOperation {

    public OpenOperation(){
        System.out.println("OpenOperation.....................");
    }

    @Autowired
    SignUpRepositoryImpl signUpRepository;

    @RequestMapping("SignUp")
    public String openSignUpPage(){
        return "signUp";
    }

}
