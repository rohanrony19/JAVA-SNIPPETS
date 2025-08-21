package com.xworkz.CRUD.service;

import com.xworkz.CRUD.dto.RegisterDTO;
import com.xworkz.CRUD.repository.RegisterRepository;
import com.xworkz.CRUD.repository.RegisterRepositoryImpl;

public class RegisterSeviceImpl implements RegisterService{
    @Override
    public boolean validate(RegisterDTO registerDTO) {

        if (registerDTO.getFirstName().length()>3){
            System.out.println(registerDTO.getFirstName());
            RegisterRepository registerRepository=new RegisterRepositoryImpl();
            registerRepository.save(registerDTO);
            return true;
        }

        return false;
    }
}
