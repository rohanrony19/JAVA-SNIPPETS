package com.rony.jdbc.service;

import com.rony.jdbc.dto.Registerdto;
import com.rony.jdbc.repository.RegisterRepoImpl;
import com.rony.jdbc.repository.RegisterRepository;

import java.sql.SQLException;

public class RegisterServiceImpl implements RegisterService {

    @Override
    public String validate(Registerdto registerdto)  {
        if (registerdto!= null){
            System.out.println("data is valid");
            RegisterRepository registerRepository=new RegisterRepoImpl();
            registerRepository.save(registerdto);
        }
        else System.out.println("validation failed");

        return "failed";
    }
}
