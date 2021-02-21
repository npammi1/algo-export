package com.luv2code.springboot.demo.myCoolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    //from application.properties
    @Value("${writer.name}")
    String writerName;

    //expose "/" that returns Hello World
    @GetMapping("/")
    public String sayHello() {

        return "Hello World : Time on Server is : " + LocalDateTime.now() + " and this code written by : " + writerName;
    }


}
