package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.PatientDTO;
import com.xworkz.jdbc.repository.PatientRepo;
import com.xworkz.jdbc.repository.PatientRepoImpl;

public class PatientServiceImpl implements PatientService{

    @Override
    public void validate(PatientDTO patientDTO) {
        if (patientDTO!= null){
            System.out.println("data is valid");
            PatientRepo patientRepo=new PatientRepoImpl();
            patientRepo.save(patientDTO);
        }
        else System.out.println("validation failed");
//        return "failed";
    }
}

