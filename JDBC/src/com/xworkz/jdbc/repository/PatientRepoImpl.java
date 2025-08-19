package com.xworkz.jdbc.repository;

import com.xworkz.jdbc.dto.PatientDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientRepoImpl implements PatientRepo{
    @Override
    public void save(PatientDTO patientDTO) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/general";
            String name="root";
            String password="REMOVED";
            Connection connection= DriverManager.getConnection(url,name,password);

            Statement statement=connection.createStatement();

            String sql = "insert into patient_details values(0,'"+patientDTO.getFullname()+"','"+patientDTO.getAppointment()+"','"+patientDTO.getBloodgroup()+"','"+patientDTO.getAge()+"','"+patientDTO.getGender()+"','"+patientDTO.getAppointmentfor()+"','"+patientDTO.getEmail()+"','"+patientDTO.getMobile()+"')";

            boolean execute = statement.execute(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
