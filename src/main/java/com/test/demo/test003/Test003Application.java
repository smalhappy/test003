package com.test.demo.test003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test003Application {

    public static void main(String[] args) {
        SpringApplication.run(Test003Application.class, args);
    }

    @GetMapping("/")
    public String index(){

        return "一个测试";
    }

}
