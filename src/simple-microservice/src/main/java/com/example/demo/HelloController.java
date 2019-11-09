package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController{

    @GetMapping(value="/hello")
    public String hello(@RequestParam(defaultValue = "Jefke") String name) {
        return "Hello from Azure Spring Cloud " + name;
    }
}