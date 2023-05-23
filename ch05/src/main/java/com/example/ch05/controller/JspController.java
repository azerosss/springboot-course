package com.example.ch05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JspController {

    @RequestMapping("/myjsp")
    public String doJsp(Model model){

        //把数据放入到request作用域
        model.addAttribute("data","SpringBoot使用Jsp");
        //request.setAttribute("data","SpringBoot使用Jsp");

        //视图的逻辑名称
        return "index";
    }
}
