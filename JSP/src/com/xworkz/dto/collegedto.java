package com.xworkz.dto;

import java.io.Serializable;

public class collegedto implements Serializable {
    private String fullName;
    private String fatherName;
    private String motherName;
    private String email;
    private long mobile;
    private String obtainedMarks;
    private String previouscol;
    private String city;
    private String state;

    public collegedto(String fullName, String fatherName, String motherName, String email, String obtainedMarks, long mobile, String previouscol, String city, String state) {
        this.fullName = fullName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.email = email;
        this.obtainedMarks = obtainedMarks;
        this.mobile = mobile;
        this.previouscol = previouscol;
        this.city = city;
        this.state = state;
    }

    public long getMobile(String mobile) {
        return this.mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getState(String state) {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFullName(String fullName) {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFatherName(String fatherName) {
        return this.fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName(String motherName) {
        return this.motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreviouscol(String previouscol) {
        return this.previouscol;
    }

    public void setPreviouscol(String previouscol) {
        this.previouscol = previouscol;
    }

    public String getObtainedMarks(String obtainedMarks) {
        return this.obtainedMarks;
    }

    public void setObtainedMarks(String obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public String getCity(String city) {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public collegedto(){
        System.out.println("No args Constructor Created by Tomcat");
    }

    @Override
    public String toString() {
        return "collegedto{" +
                "fullName='" + fullName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", obtainedMarks='" + obtainedMarks + '\'' +
                ", previouscol='" + previouscol + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
