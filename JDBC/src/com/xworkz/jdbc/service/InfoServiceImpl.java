package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.InfoDTO;
import com.xworkz.jdbc.repository.InfoRepository;
import com.xworkz.jdbc.repository.InfoRepositoryImpl;

public class InfoServiceImpl implements InfoService{
    @Override
    public String validate(InfoDTO dto) {
        System.out.println("dto============"+dto);
        if (dto.getEmail()!= null){
            System.out.println("data is valid");
            InfoRepository infoRepository=new InfoRepositoryImpl();
            infoRepository.save(dto);
            return "success";
        }
        else System.out.println("validation failed");
        return "failed";
    }
}
