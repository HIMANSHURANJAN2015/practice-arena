package com.scaler.himanshufirstapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstEntry {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloWithName(@PathVariable String name) {
        return "Hello " + name;
    }
}