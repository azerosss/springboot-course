package com.example.ch09springbootmapper.dao;

import com.example.ch09springbootmapper.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper {
    Student selectStudentById(@Param("id") Integer id);

}
