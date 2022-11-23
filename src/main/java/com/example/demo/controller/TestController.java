package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Deprecated(since = "0.0.1-SNAPSHOT", forRemoval = true)
public class TestController {

    @GetMapping("/")
    public String getTest() {
        return "Bookder test view";
    }
}
