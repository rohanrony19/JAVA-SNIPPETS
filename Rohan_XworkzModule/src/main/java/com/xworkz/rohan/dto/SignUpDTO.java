package com.xworkz.rohan.dto;

//import com.sun.istack.internal.NotNull;
import lombok.*;

import javax.validation.constraints.Size;

@Data
public class SignUpDTO {

//    @NotNull
    @Size(min = 3,max = 30,message = "User Name should be between 3 and 30")
    private String name;

    private long phoneNumber;
    private String email;
    private int age;
    private String password;
    private String confirmPassword;
    private String address;
    private String gender;
}
