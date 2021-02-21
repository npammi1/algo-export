package com.luv2code.springboot.demo.myCoolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController1 {

    //from application.properties
    @Value("${coach.name}")
    private String coachName;

    //expose "/" that returns Hello World

    @GetMapping("/end")
    public String sayHello() {
        return "Hello World ! Time on Server is : " + LocalDateTime.now() + " here is coach name : " + coachName;
    }
}
