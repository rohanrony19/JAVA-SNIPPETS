package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.PatientDTO;

public interface PatientRepo {
    void save(PatientDTO patientDTO);
}
