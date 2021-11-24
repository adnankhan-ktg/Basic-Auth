package com.intelliatech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/user/home/window")
    public String home()
    {
        return "I am in the home()";
    }
}
