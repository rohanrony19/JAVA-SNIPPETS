package com.xworkz.jdbc.repository;

import com.mysql.cj.jdbc.Driver;
import com.xworkz.jdbc.dto.InfoDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InfoRepositoryImpl implements InfoRepository{
    @Override
    public void save(InfoDTO dto) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/general";
            String name="root";
            String password="REMOVED";

          Connection connection= DriverManager.getConnection(url,name,password);

          Statement statement=connection.createStatement();
          String sql="insert into info_details values(0,'"+dto.getName()+"','"+dto.getFatherName()+"','"+dto.getMotherName()+"','"+dto.getEmail()+"',"+dto.getPhoneNumber()+")";
          statement.execute(sql);



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
