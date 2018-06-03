package com.xzh.www.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {

    @RequestMapping("")
    public void sayHello(){
        System.out.println("Hello World");
    }
}
