package com.xworkz.jdbc.dto;

import java.io.Serializable;

public class PatientDTO implements Serializable {
    private String fullname;
    private String appointment;
    private String bloodgroup;
    private int age;
    private String gender;
    private String Appointmentfor;
    private String email;
    private long mobile;

    public PatientDTO(String fullname, String appointment, String bloodgroup, int age, String gender, String Appointmentfor, String email, long mobile) {
        this.fullname = fullname;
        this.appointment = appointment;
        this.bloodgroup = bloodgroup;
        this.age = age;
        this.gender = gender;
        this.Appointmentfor = Appointmentfor;
        this.email = email;
        this.mobile = mobile;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAppointmentfor() {
        return Appointmentfor;
    }

    public void setAppointmentfor(String appointmentfor) {
        this.Appointmentfor = appointmentfor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "fullname='" + fullname + '\'' +
                ", appointment='" + appointment + '\'' +
                ", bloodgroup='" + bloodgroup + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Appntfor='" + Appointmentfor + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
