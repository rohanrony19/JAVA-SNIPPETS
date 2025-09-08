package com.xworkz.rohan.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "signup_details")
@NamedQuery(name="getSignUpDetails",query = "select e from RegisterEntity e where name=:nameBy")
@NamedQuery(name="checkEmail",query = "select e from RegisterEntity e where email=:emailBy")
public class RegisterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Phone_Number")
    private long phoneNumber;

    @Column(name = "Email")
    private String email;

    @Column(name = "Age")
    private int age;

    @Column(name = "Password")
    private String password;

    @Column(name = "Address")
    private String address;

    @Column(name = "Gender")
    private String gender;

    @Column(name="login_attempt")
    private int loginAttempt=0;

    @Column(name="local_date_time")
    private LocalDateTime localDateTime;

}
