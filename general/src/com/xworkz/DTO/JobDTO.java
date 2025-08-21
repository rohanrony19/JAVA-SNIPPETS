package com.xworkz.DTO;

import java.io.Serializable;

public class JobDTO implements Serializable {
    private String name;
    private String email;
    private long mobile;
    private String city;
    private String type;

    public JobDTO(){
        System.out.println("No args Constructor Created by Tomcat");
    }

    public JobDTO(String name, String email, String type, String city, long mobile) {
        this.name = name;
        this.email = email;
        this.type = type;
        this.city = city;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "JobDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
