package com.javatechie.spring.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class ApplicationController
{

    @GetMapping("/getMsg")
    public String greeting()
    {
        return "Spring Security example";
    }

    @RequestMapping("/")
    public ModelAndView defaultHome() {
        return new ModelAndView("login");
    }

}
