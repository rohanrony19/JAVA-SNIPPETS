package com.rony.jdbc.dto;

import java.io.Serializable;

public class Logindto implements Serializable {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Logindto(String email, String password) {
        this.email = email;
        this.password = password;
    }
        @Override
        public String toString() {
            return "Logindto{" +
                    "email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }

    }

