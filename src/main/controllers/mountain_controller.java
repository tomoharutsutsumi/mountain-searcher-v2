package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MountainController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "John");
        return "index";  // This refers to home.html template
    }
}
