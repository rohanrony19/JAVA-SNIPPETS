package com.xworkz.manage.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

@Configuration
@ComponentScan(basePackages = "com.xworkz.manage.internal")
public class ManageConfiguration  {

    public ManageConfiguration(){
        System.out.println("running manageConfiguration");
    }
 
    @Bean//custom class (.java/.class)
    String getMail(){

        return "shriharshaKm10@gmail.com";
    }
    @Bean
    Collection<Integer> getNo(){

        Collection<Integer> nums=new ArrayList();

        return nums;
    }

}
