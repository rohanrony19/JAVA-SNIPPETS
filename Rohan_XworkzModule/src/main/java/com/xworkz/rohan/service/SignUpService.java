package com.xworkz.rohan.service;

import com.xworkz.rohan.dto.SignUpDTO;
import org.springframework.stereotype.Component;


public interface SignUpService {
    String  validate(SignUpDTO sign);
}
