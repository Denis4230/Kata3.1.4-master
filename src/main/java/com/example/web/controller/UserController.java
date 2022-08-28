package com.example.web.controller;

import com.example.web.model.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public String getUserInfo(@AuthenticationPrincipal User user,
                              Model model) {
        model.addAttribute("user", user);
        return "user";
    }
}