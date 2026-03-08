package com.microservices.rest.web_services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {


    @GetMapping("/hello")
    public String user(){

        return "Hello Suraj !";
    }

}
