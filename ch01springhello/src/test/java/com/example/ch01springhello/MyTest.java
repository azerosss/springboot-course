package com.example.ch01springhello;

import com.example.ch01springhello.config.SpringConfig;
import com.example.ch01springhello.vo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test01(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = (Student) ctx.getBean("createStudent");
        Student student1 = (Student) ctx.getBean("myStudent");
        System.out.println("student===" + student);
        System.out.println("student===" + student1);

    }

    @Test
    public void test02(){

    }
}
