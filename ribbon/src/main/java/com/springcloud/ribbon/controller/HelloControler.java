package com.springcloud.ribbon.controller;


import com.springcloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/test")
    public String hello(@RequestParam String name){
        return helloService.helloService(name);
    }

    @RequestMapping(value = "/serviceA",method = RequestMethod.GET)
    public String say(@RequestParam String name){
        return "I am service a";
    }

}
