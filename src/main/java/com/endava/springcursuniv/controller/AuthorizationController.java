package com.endava.springcursuniv.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.endava.springcursuniv.model.UserEntity;
import com.endava.springcursuniv.service.UserService;

@Controller
public class AuthorizationController {

    private final UserService userService;

    AuthorizationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterForm(UserEntity userDetails) {
        return "sign-up";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/register")
    public String registerUser(@Valid UserEntity userEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "sign-up";
        }
        userService.addUser(userEntity);
        return "redirect:login";
    }

}
