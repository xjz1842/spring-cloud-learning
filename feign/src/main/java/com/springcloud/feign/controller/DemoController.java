package com.springcloud.feign.controller;

import com.springcloud.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String sayHello(@RequestParam String name){
        return helloService.sayHiFromClient(name);
    }

    @RequestMapping(value = "/serviceB",method = RequestMethod.GET)
    public String say(@RequestParam String name){
        return "I am service b";
    }

}
