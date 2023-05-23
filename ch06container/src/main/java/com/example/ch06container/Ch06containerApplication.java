package com.example.ch06container;

import com.example.ch06container.service.SomeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Ch06containerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Ch06containerApplication.class, args);
        SomeService service = (SomeService) ctx.getBean("someService");
        service.sayHello("lisi");
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("输出，在容器创建对象好后执行代码");
    }

}
