package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Profile",loadOnStartup = 9)
public class Myself extends GenericServlet {

    public Myself() {
        System.out.println("Profile created by Tomcat");
    }  

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Profile");

        String ref1 = servletRequest.getParameter("name");
        System.out.println("name: " + ref1);

        String ref2 = servletRequest.getParameter("age");
        System.out.println("age: " + ref2);

        String ref3 = servletRequest.getParameter("gender");
        System.out.println("gender: " + ref3);

        String ref4 = servletRequest.getParameter("location");
        System.out.println("location: " + ref4);

        String ref5 = servletRequest.getParameter("education");
        System.out.println("education: " + ref5);

        String ref6 = servletRequest.getParameter("university");
        System.out.println("university: " + ref6);

        String ref7 = servletRequest.getParameter("college");
        System.out.println("college: " + ref7);

        String ref8 = servletRequest.getParameter("skills");
        System.out.println("skills: " + ref8);

        String ref9 = servletRequest.getParameter("experience");
        System.out.println("experience: " + ref9);

        String ref10 = servletRequest.getParameter("hobbies");
        System.out.println("hobbies: " + ref10);

        String ref11 = servletRequest.getParameter("languageKnown");
        System.out.println("languageKnown: " + ref11);

        String ref12 = servletRequest.getParameter("goal");
        System.out.println("goal: " + ref12);

        String ref13 = servletRequest.getParameter("strengths");
        System.out.println("strengths: " + ref13);

        String ref14 = servletRequest.getParameter("certifications");
        System.out.println("certifications: " + ref14);

        String ref15 = servletRequest.getParameter("projects");
        System.out.println("projects: " + ref15);

        String ref16 = servletRequest.getParameter("linkedin");
        System.out.println("linkedin: " + ref16);

        String ref17 = servletRequest.getParameter("github");
        System.out.println("github: " + ref17);

        String ref18 = servletRequest.getParameter("email");
        System.out.println("email: " + ref18);

        String ref19 = servletRequest.getParameter("contact");
        System.out.println("contact: " + ref19);
    }
}

