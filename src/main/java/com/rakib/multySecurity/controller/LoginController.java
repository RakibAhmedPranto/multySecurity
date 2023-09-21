package com.rakib.multySecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String loginForm() {
        return "login";
    }

    @RequestMapping("/user")
    public String userView() {
        return "user";
    }

//    @GetMapping("/registration")
//    public String registrationForm(Model model) {
//        UserDto user = new UserDto();
//        model.addAttribute("user", user);
//        return "registration";
//    }
}
