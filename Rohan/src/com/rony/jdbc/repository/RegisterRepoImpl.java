package com.rony.jdbc.repository;

import com.rony.jdbc.dto.Registerdto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterRepoImpl implements RegisterRepository{
    @Override
    public void save(Registerdto registerdto){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url="jdbc:mysql://localhost:3306/general";
            String name="root";
            String password="REMOVED";
            Connection connection= DriverManager.getConnection(url,name,password);
            Statement statement=connection.createStatement();
            String sql="insert into register_details values(0,'"+registerdto.getFirstName()+"','"+registerdto.getLastName()+"','"+registerdto.getAge()+"','"+registerdto.getGender()+"',"+registerdto.getMobile()+")";
            statement.execute(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
