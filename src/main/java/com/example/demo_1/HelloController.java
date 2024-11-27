package com.example.demo_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public static final String HELLO_STRING = "Hello! bruh";

    @GetMapping("/")
    public String sayHello() {
        return HELLO_STRING;
    }
}
