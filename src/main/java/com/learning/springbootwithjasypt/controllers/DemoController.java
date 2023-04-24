package com.learning.springbootwithjasypt.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${database.password}")
    private String password;

    @GetMapping("/demo")
    public String getPassword() {

        return this.password;
    }
}