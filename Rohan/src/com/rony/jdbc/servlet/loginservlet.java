package com.rony.jdbc.servlet;

import com.rony.jdbc.dto.Logindto;
import com.rony.jdbc.service.LoginService;
import com.rony.jdbc.service.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Login")
public class loginservlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        Logindto logindto=new Logindto(email,password);
        LoginService loginService=new LoginServiceImpl();
        loginService.validate(logindto);
        System.out.println(logindto);
    }
}
