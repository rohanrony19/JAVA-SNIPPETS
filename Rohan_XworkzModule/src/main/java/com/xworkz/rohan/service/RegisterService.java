package com.xworkz.rohan.service;

import com.xworkz.rohan.dto.RegisterDTO;
import com.xworkz.rohan.dto.UpdateDto;


public interface RegisterService {
    boolean save(RegisterDTO registerDTO);

    RegisterDTO find(String name,String password);

    RegisterDTO findByEmail(String email);

    boolean updatePassword(String password);

    boolean updateProfile(UpdateDto dto);

    void sendOtp(String email);

    boolean verifyOtp(String otp);
}
