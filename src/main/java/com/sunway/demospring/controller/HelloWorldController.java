package com.sunway.demospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorldController {


    @GetMapping
    public String testMethod(){
        return "Hello World";
    }


}
