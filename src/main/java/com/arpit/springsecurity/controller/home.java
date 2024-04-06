package com.arpit.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {

    @GetMapping("/public")
    public String normalUser() {
        return "Hello World";
    }

    @GetMapping("/user")
    public String User() {
        return "Hello User";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin";
    }

}
