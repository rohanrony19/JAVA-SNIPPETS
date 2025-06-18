package com.rony.jdbc.servlet;

import com.rony.jdbc.dto.Registerdto;
import com.rony.jdbc.service.RegisterService;
import com.rony.jdbc.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/register")
public class registerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName=req.getParameter("firstName");
        String lastName=req.getParameter("lastName");
        int age=Integer.parseInt(req.getParameter("age"));
        String gender=req.getParameter("gender");
        long mobile=Long.parseLong(req.getParameter("mobile"));

        Registerdto registerdto=new Registerdto(firstName,lastName,age,gender,mobile);


        RegisterService registerService = new RegisterServiceImpl();
        registerService.validate(registerdto);

        System.out.println(registerdto);


    }
}
