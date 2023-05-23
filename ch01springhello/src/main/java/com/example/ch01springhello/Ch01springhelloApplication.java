package com.example.ch01springhello;

import com.example.ch01springhello.config.SpringConfig;
import com.example.ch01springhello.vo.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Ch01springhelloApplication {

    public static void main(String[] args) {

        SpringApplication.run(Ch01springhelloApplication.class, args);

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("createStudent");
        Student student1 = (Student) ctx.getBean("myStudent");
        System.out.println("student===" + student);
        System.out.println("student===" + student1);
    }

}
