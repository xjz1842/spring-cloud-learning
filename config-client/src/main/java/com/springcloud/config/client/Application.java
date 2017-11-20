package com.springcloud.config.client;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/test")
    public String hello(){
        return foo;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
