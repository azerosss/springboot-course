package com.example.ch06container.service.impl;

import com.example.ch06container.service.SomeService;
import org.springframework.stereotype.Service;


@Service("someService")
public class SomeServiceImpl implements SomeService {
    @Override
    public void sayHello(String name){
        System.out.println("welcom" + name);
    }
}
