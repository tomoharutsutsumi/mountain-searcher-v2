package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.GetMapping;


// @Controller
// public class MountainController {

//     @GetMapping("/index")
//     public String index(Model model) {
//         model.addAttribute("name", "John");
//         return "index";  // This refers to home.html template
//     }
// }

// package com.example.demo.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// @Controller
// public class HomeController {

//     @GetMapping("/home")
//     public String home(Model model) {
//         model.addAttribute("name", "John");
//         return "home";  // This refers to home.html template
//     }
// }

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}

