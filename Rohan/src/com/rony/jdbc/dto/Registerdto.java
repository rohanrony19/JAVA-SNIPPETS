package com.rony.jdbc.dto;

import java.io.Serializable;

public class Registerdto implements Serializable {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private long mobile;

    public Registerdto(String firstName, String lastName, int age, String gender, long mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = Integer.parseInt(age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = Long.parseLong(mobile);
    }

    @Override
    public String toString() {
        return "Registerdto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
