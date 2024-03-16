package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "customer/login";
    }

    @RequestMapping("/register")
    public String register() {
        return "customer/register";
    }

    @RequestMapping("/404")
    public String toPage404() {
        return "404/404";
    }

}
