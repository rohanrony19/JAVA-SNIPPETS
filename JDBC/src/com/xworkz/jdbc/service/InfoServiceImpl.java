package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.InfoDTO;
import com.xworkz.jdbc.repository.InfoRepository;
import com.xworkz.jdbc.repository.InfoRepositoryImpl;

public class InfoServiceImpl implements InfoService{
    @Override
    public String validate(InfoDTO dto) {

        if (dto!= null){
            System.out.println("data is valid");
            InfoRepository infoRepository=new InfoRepositoryImpl();
            infoRepository.save(dto);
        }
        else System.out.println("validation failed");
        return "failed";
    }
}
