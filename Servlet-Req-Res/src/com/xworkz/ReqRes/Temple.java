package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Temple",loadOnStartup = 4)
public class Temple extends GenericServlet {

    public Temple() {
        System.out.println("Temple created by Tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Temple");

        String ref1 = servletRequest.getParameter("location");
        System.out.println("location: " + ref1);

        String ref2 = servletRequest.getParameter("temple1");
        System.out.println("temple1: " + ref2);

        String ref3 = servletRequest.getParameter("prasad1");
        System.out.println("prasad1: " + ref3);

        String ref4 = servletRequest.getParameter("bajan1");
        System.out.println("bajan1: " + ref4);

        String ref5 = servletRequest.getParameter("temple2");
        System.out.println("temple2: " + ref5);

        String ref6 = servletRequest.getParameter("prasad2");
        System.out.println("prasad2: " + ref6);

        String ref7 = servletRequest.getParameter("bajan2");
        System.out.println("bajan2: " + ref7);

        String ref8 = servletRequest.getParameter("temple3");
        System.out.println("temple3: " + ref8);

        String ref9 = servletRequest.getParameter("prasad3");
        System.out.println("prasad3: " + ref9);

        String ref10 = servletRequest.getParameter("bajan3");
        System.out.println("bajan3: " + ref10);

        String ref11 = servletRequest.getParameter("entry");
        System.out.println("entry: " + ref11);
    }
}  