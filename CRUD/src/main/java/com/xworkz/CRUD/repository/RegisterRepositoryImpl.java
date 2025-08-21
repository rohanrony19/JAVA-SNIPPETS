package com.xworkz.CRUD.repository;

import com.xworkz.CRUD.dto.RegisterDTO;

import java.sql.*;

public class RegisterRepositoryImpl implements RegisterRepository{
    @Override
    public void save(RegisterDTO registerDTO) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/crud";
            String name="root";
            String password="REMOVED";
            Connection connection = DriverManager.getConnection(url,name,password);
//            String sql="INSERT INTO register_details VALUES(0,'"+registerDTO.getFirstName()+"')";
//            Statement statement=connection.createStatement();
//            statement.execute(sql);

            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO register_details VALUES(?,?,?,?,?,?)");
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2,registerDTO.getFirstName());
            preparedStatement.setString(3,registerDTO.getLastName());
            preparedStatement.setString(4,registerDTO.getEmail());
            preparedStatement.setString(5,registerDTO.getCity());
            preparedStatement.setInt(6,registerDTO.getPinCode());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
