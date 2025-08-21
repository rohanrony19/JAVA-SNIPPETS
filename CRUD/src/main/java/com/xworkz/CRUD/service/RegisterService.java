package com.xworkz.CRUD.service;

import com.xworkz.CRUD.dto.RegisterDTO;

public interface RegisterService {
    boolean validate(RegisterDTO registerDTO);
}
