package com.example.ch08springbootservlet.config;

import com.example.ch08springbootservlet.filter.MyFilter;
import com.example.ch08springbootservlet.servlet.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean reg = new ServletRegistrationBean(new MyServlet(), "/loginServlet");
        return reg;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean reg = new FilterRegistrationBean();
        reg.setFilter(new MyFilter());
        reg.addUrlPatterns("/user/*");
        return reg;
    }
}
