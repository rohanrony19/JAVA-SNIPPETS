package com.xworkz.snake.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
         return new Class[]{};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
