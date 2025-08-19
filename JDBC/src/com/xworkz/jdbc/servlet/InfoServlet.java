package com.xworkz.jdbc.servlet;

import com.xworkz.jdbc.dto.InfoDTO;
import com.xworkz.jdbc.service.InfoService;
import com.xworkz.jdbc.service.InfoServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/family")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fullName");
        String fatherName = req.getParameter("fatherName");
        String motherName = req.getParameter("motherName");
        String email = req.getParameter("email");
        long phoneNumber = Long.parseLong(req.getParameter("mobile"));

        InfoDTO dto = new InfoDTO(name, fatherName, motherName, email, phoneNumber);
        InfoService infoService = new InfoServiceImpl();

        String saved = infoService.validate(dto);


        System.out.println(dto);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("familydetails.jsp");
        if (saved.equalsIgnoreCase("success")) {
            req.setAttribute("success", "data submitted sucessfully");
        } else {
            req.setAttribute("success", "data not submitted sucessfully");
        }
        requestDispatcher.forward(req, resp);
    }
}