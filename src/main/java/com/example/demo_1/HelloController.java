package com.example.demo_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public static final String HELLO_STRING = "Hello! version 3";

    @GetMapping("/")
    public String sayHello() {
        return HELLO_STRING;
    }
}
