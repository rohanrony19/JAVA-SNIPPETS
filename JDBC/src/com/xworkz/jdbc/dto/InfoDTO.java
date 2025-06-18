package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class InfoDTO implements Serializable {

    private String name;
    private String fatherName;
    private String motherName;
    private String email;
    private long phoneNumber;

    public InfoDTO(String name, String fatherName, String motherName, String email, long phoneNumber) {
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "InfoDTO{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
