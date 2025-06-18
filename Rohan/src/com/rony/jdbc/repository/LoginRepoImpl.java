package com.rony.jdbc.repository;

import com.rony.jdbc.dto.Logindto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginRepoImpl implements LoginRepo {
    @Override
    public void save(Logindto logindto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/general";
            String name = "root";
            String password = "REMOVED";
            Connection connection = DriverManager.getConnection(url, name, password);
            Statement statement = connection.createStatement();
            String sql = "insert into login_details values(0,'" + logindto.getEmail() + "','" + logindto.getPassword() + "')";
            statement.execute(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}