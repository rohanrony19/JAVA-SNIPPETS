package com.xworkz.Repository;

import com.xworkz.dto.collegedto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class collegeRepositoryImpl implements collegeRepository{
    @Override
    public void save(collegedto dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/jsp";
            String name="root";
            String password="REMOVED";

            Connection connection= DriverManager.getConnection(url,name,password);

            Statement statement=connection.createStatement();
//            String sql="insert into info_details values(0,'"+dto.getName()+"','"+dto.getFatherName()+"','"+dto.getMotherName()+"','"+dto.getEmail()+"',"+dto.getPhoneNumber()+")";
//            statement.execute(sql);



        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
