package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/Movie",loadOnStartup = 1)
public class Movie extends GenericServlet {

    public Movie(){
        System.out.println("Movie created by Tomcat");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Movie");

        String ref1 = servletRequest.getParameter("name");
        System.out.println("name:" + ref1);

        String ref2 = servletRequest.getParameter("hero");
        System.out.println("hero:" + ref2);
      
        String ref3 = servletRequest.getParameter("heroin");
        System.out.println("heroin:" + ref3);

        String ref4 = servletRequest.getParameter("story");
        System.out.println("story: " + ref4);

        String ref5 = servletRequest.getParameter("price");
        System.out.println("price: " + ref5);

        System.out.println("");
    }
}
