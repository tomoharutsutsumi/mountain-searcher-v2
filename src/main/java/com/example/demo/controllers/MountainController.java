// package com.example.demo.controllers;

// // import org.springframework.web.bind.annotation.RestController;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;

// // import org.springframework.web.bind.annotation.RestController;
// // import org.springframework.web.bind.annotation.GetMapping;


// // @Controller
// // public class MountainController {

// //     @GetMapping("/index")
// //     public String index(Model model) {
// //         model.addAttribute("name", "John");
// //         return "index";  // This refers to home.html template
// //     }
// // }

// // package com.example.demo.controller;

// // import org.springframework.stereotype.Controller;
// // import org.springframework.ui.Model;
// // import org.springframework.web.bind.annotation.GetMapping;

// // @Controller
// // public class HomeController {

// //     @GetMapping("/home")
// //     public String home(Model model) {
// //         model.addAttribute("name", "John");
// //         return "home";  // This refers to home.html template
// //     }
// // }

// @Controller
// public class MountainController {

//     @GetMapping("/")
//     public String home(Model model) {
//         model.addAttribute("name", "John");
//         return "home";  // This refers to home.html template
//     }
// }



import com.example.demo.models.Mountain;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller
public class MountainController {

    @GetMapping("/")
    public String home(Model model) {
        // Create a mock list of Mountain instances
        List<Mountain> mountains = Arrays.asList(
                new Mountain(1, "MountainA", "PrefectureA", true, 12.345f, 54.321f),
                new Mountain(2, "MountainB", "PrefectureB", false, 23.456f, 65.432f),
                new Mountain(3, "MountainC", "PrefectureC", true, 34.567f, 76.543f)
        );

        // Add the list to the model
        model.addAttribute("mountains", mountains);

        return "home";  // This refers to home.html template
    }
}
