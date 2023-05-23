package com.example.ch01springhello.config;

import com.example.ch01springhello.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setId(1001);
        student.setName("ZhangSan");
//        System.out.println("test-Bean");
        return student;
    }


    @Bean(value = "myStudent")
    public Student makeStudent(){
        Student student = new Student();
        student.setId(1002);
        student.setName("LiSi");
        return student;
    }
}
