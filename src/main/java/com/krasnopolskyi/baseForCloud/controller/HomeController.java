package com.krasnopolskyi.baseForCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String getHomePage() {
        return "home";
    }

    @GetMapping("/login")
    public String toLogin() {
        return "login";
    }

    @GetMapping("/registration")
    public String toRegistration() {
        return "registration";
    }

    @PostMapping("/login")
    public String login() {
        log.info("prepare for login user");
        return "home";
    }

    @PostMapping("/registration")
    public String registration() {
        log.info("prepare for registration user");
        return "home";
    }

}
