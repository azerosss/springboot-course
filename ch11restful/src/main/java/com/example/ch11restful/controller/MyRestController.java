package com.example.ch11restful.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {
    //get请求
    @GetMapping(value = "/student/{studentId}/{classname}")
    public String queryStudent(@PathVariable(value = "studentId") Integer id,
                               @PathVariable String classname){
        return "get 请求，查询学生 studentId："+id+", 班级："+classname;
    }

    @GetMapping(value = "/student/{studentId}/school/{schoolname}")
    public String queryStudentBySchool(@PathVariable(value = "studentId")
                                               Integer id,
                                       @PathVariable String schoolname){
        return "get 请求，查询学生 studentId："+id+", 班级："+schoolname;
    }

    @PostMapping("/student/{stuId}")
    public String createStudent(@PathVariable("stuId") Integer id,
                                String name,
                                Integer age){
        return "post 创建学生， id="+id+",name="+name+",age="+age;
    }
    @PutMapping("/student/{stuId}")
    public String modifyStudent(@PathVariable("stuId") Integer id,
                                String name){
        System.out.println("===========put 请求方式 ========");
        return "put 修改学生， id="+id+",修改的名称是："+name;
    }
    @DeleteMapping("/student/{stuId}")
    public String removeStudent(@PathVariable("stuId") Integer id) {
        System.out.println("===========delete 请求方式 ========");
        return "delete 删除学生，id=" + id;
    }
}
