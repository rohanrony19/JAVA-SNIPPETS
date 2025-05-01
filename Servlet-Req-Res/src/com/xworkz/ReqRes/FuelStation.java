package com.xworkz.ReqRes;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/FuelStation", loadOnStartup = 3)
public class FuelStation extends GenericServlet {

    public FuelStation(){
        System.out.println("Hotel created by Tomcat");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service in Hotel");

        String ref1 = servletRequest.getParameter("name");
        System.out.println("name: " +ref1);

        String ref2 = servletRequest.getParameter("bunker");
        System.out.println("bunker: " +ref2);

        String ref3 = servletRequest.getParameter("fuel1");
        System.out.println("fuel1: " +ref3);

        String ref4 = servletRequest.getParameter("fuel2");
        System.out.println("fuel2: " +ref4);

        String ref5 = servletRequest.getParameter("gas");
        System.out.println("gas: " +ref5);

        String ref6 = servletRequest.getParameter("petrolprice");
        System.out.println("petrolprice: " +ref6);

        String ref7 = servletRequest.getParameter("dieselprice");
        System.out.println("dieselprice: " +ref7);

        String ref8 = servletRequest.getParameter("2wheelervisits");
        System.out.println("2wheelervisits: " +ref8);

        String ref9 = servletRequest.getParameter("4wheelervisits");
        System.out.println("4wheelervisits: " +ref9);
    }
}
