package com.xworkz.rohan.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "signup_details")
//@NamedQuery(name = "",query = "")
public class SignUpEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

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
//    @Column(name = "")
//    private String confirmPassword;
    @Column(name = "Address")
    private String address;
    @Column(name = "Gender")
    private String gender;

//    public SignUpEntity(String name, long phoneNumber, String email, int age, String password, String address, String gender) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.age = age;
//        this.password = password;
//        this.address = address;
//        this.gender = gender;
//    }

    @Override
    public String toString() {
        return "SignUpEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
