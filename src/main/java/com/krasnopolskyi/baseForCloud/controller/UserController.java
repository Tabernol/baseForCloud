package com.krasnopolskyi.baseForCloud.controller;

import com.krasnopolskyi.baseForCloud.entity.User;
import com.krasnopolskyi.baseForCloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String getAll(Model model) {
        List<User> users = userService.getAll();
        model.addAttribute("my", "myString from model");
        model.addAttribute("users", users);
        return "user/users";
    }
}
