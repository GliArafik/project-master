package com.app.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public String getTest() {
        return "This test without auth.";
    }

    @GetMapping("/v1/test")
    public String getTestWithAuth() {
        return "test request with auth.";
    }
}
