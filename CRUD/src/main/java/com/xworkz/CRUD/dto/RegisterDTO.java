package com.xworkz.CRUD.dto;

import lombok.*;

import java.io.Serializable;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RegisterDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private int pinCode;


}
