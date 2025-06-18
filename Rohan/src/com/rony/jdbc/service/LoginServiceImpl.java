package com.rony.jdbc.service;

import com.rony.jdbc.dto.Logindto;
import com.rony.jdbc.repository.LoginRepo;
import com.rony.jdbc.repository.LoginRepoImpl;
import com.rony.jdbc.repository.RegisterRepository;

public class LoginServiceImpl implements LoginService{
    @Override
    public String validate(Logindto logindto) {
        if (logindto!= null){
            System.out.println("data is valid");
            LoginRepo loginRepo=new LoginRepoImpl();
            loginRepo.save(logindto);
        }
        else System.out.println("validation failed");
        return "failed";
    }
}
