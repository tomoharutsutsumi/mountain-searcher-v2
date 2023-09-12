package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MountainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "John");
        return "home";  // This refers to home.html template
    }
}
