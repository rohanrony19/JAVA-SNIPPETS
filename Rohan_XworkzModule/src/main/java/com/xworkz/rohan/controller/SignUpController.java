package com.xworkz.rohan.controller;

import com.xworkz.rohan.dto.SignUpDTO;
import com.xworkz.rohan.entity.SignUpEntity;
import com.xworkz.rohan.service.SignUpService;
import com.xworkz.rohan.service.SignUpServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/SignUp")
public class SignUpController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("SignUp.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running signUp in controller");
        String name = req.getParameter("name");
        long phone = Long.parseLong(req.getParameter("phone"));
        String email = req.getParameter("email");
        int age = Integer.parseInt(req.getParameter("age"));
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String address = req.getParameter("address");
        String gender = req.getParameter("gender");

        SignUpDTO signUpDTO = new SignUpDTO();
//        SignUpEntity sign = new SignUpEntity();
        signUpDTO.setName(name);
        signUpDTO.setPhoneNumber(phone);
        signUpDTO.setEmail(email);
        signUpDTO.setAge(age);
        signUpDTO.setPassword(password);
        signUpDTO.setConfirmPassword(confirmPassword);
        signUpDTO.setAddress(address);
        signUpDTO.setGender(gender);

        SignUpService sign = new SignUpServiceImpl();
        String result = sign.validate(signUpDTO);
        System.out.println(result);

        if(!result.equals("validData")){
            if(result.equals("nameError")){
                String nameError = "Please enter valid name";
                req.setAttribute("nameError",nameError);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("SignUp.jsp");
                requestDispatcher.forward(req,resp);
            }
        }   
        else {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Autowired.jsp");
            requestDispatcher.forward(req,resp);
        }
    }
}
