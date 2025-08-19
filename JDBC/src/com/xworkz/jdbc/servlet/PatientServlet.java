package com.xworkz.jdbc.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/patientPage")
public class PatientServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("patientdetail.jsp");
        requestDispatcher.forward(req,res);
    }
}
