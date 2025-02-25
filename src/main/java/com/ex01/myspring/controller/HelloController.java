package com.ex01.myspring.controller;

//import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        return "hello";
    }
}
