package com.springcloud.feign.service;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client")
public interface HelloService {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String sayHiFromClient(@RequestParam(value = "name") String name);

}
