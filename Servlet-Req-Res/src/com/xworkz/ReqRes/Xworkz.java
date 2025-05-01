package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Xworkz",loadOnStartup = 7)
public class Xworkz extends GenericServlet {

    public Xworkz() {
        System.out.println("Xworkz created by Tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Xworkz");

        String ref1 = servletRequest.getParameter("name");
        System.out.println("name: " + ref1);

        String ref2 = servletRequest.getParameter("location");
        System.out.println("location: " + ref2);

        String ref3 = servletRequest.getParameter("founder");
        System.out.println("founder: " + ref3);

        String ref4 = servletRequest.getParameter("established");
        System.out.println("established: " + ref4);

        String ref5 = servletRequest.getParameter("industry");
        System.out.println("industry: " + ref5);

        String ref6 = servletRequest.getParameter("courses");
        System.out.println("courses: " + ref6);

        String ref7 = servletRequest.getParameter("brakes");
        System.out.println("brakes: " + ref7);

        String ref8 = servletRequest.getParameter("studentsTrained");
        System.out.println("studentsTrained: " + ref8);

        String ref9 = servletRequest.getParameter("placementSupport");
        System.out.println("placementSupport: " + ref9);

        String ref10 = servletRequest.getParameter("website");
        System.out.println("website: " + ref10);

        String ref11 = servletRequest.getParameter("rating");
        System.out.println("rating: " + ref11);

        String ref12 = servletRequest.getParameter("mode");
        System.out.println("mode: " + ref12);

        String ref13 = servletRequest.getParameter("contact");
        System.out.println("contact: " + ref13);

        String ref14 = servletRequest.getParameter("mentor");
        System.out.println("mentor: " + ref14);

        String ref15 = servletRequest.getParameter("events");
        System.out.println("events: " + ref15);
    }
}

