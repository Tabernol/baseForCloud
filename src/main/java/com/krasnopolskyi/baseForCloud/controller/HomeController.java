package com.krasnopolskyi.baseForCloud.controller;

import com.krasnopolskyi.baseForCloud.dto.UserPostDto;
import com.krasnopolskyi.baseForCloud.entity.User;
import com.krasnopolskyi.baseForCloud.mapper.UserMapper;
import com.krasnopolskyi.baseForCloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class HomeController {

    private final UserService userService;
    private final UserMapper userMapper;

    public HomeController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

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
    public String registration(UserPostDto userPostDto) {
        User user = userMapper.mapToUser(userPostDto);
        userService.save(user);
        return "home";
    }

}
