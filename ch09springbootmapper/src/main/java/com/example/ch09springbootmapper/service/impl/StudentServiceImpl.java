package com.example.ch09springbootmapper.service.impl;

import com.example.ch09springbootmapper.dao.StudentMapper;
import com.example.ch09springbootmapper.domain.Student;
import com.example.ch09springbootmapper.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student queryStudent(Integer id){
        Student student = studentMapper.selectStudentById(id);
        return student;
    }
}
