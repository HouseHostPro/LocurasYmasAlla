package com.api.springBoot.controller;

import com.api.springBoot.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
    private GreetingService greetingService;

    // en aquest endpoint hi accedirem per GET
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello springboot";
    }

    @GetMapping("/hello-world-custom")
    public String helloWorldCustom() {
        return this.greetingService.saluda("Toni");
    }
}
