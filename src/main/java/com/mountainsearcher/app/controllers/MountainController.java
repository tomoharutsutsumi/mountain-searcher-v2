package com.mountainsearcher.app.controllers;
import com.mountainsearcher.app.models.Mountain;
import org.springframework.stereotype.Controller;
import com.mountainsearcher.app.services.WeatherService;
import com.mountainsearcher.app.repositories.MountainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MountainController {

    @Autowired
    private MountainRepository mountainRepository;

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mountains", mountainRepository.findAll());
        return "home";
    }

    @GetMapping("/search")
    public String search(@RequestParam("daysLater") int targetDay) {

        // method to calculate the difference between today and sent date  
        LocalDate today = LocalDate.now();
        int dayLater = targetDay - today
        weatherService.GetWeatherData(dayLater)
        // model.addAttribute("mountains", mountainRepository.findAll());
        return "home";
    }


}













// @Controller
// public class MountainController {

//     private final MountainRepository mountainRepository;

//     @Autowired
//     public MountainController(MountainRepository mountainRepository) {
//         this.mountainRepository = mountainRepository;
//     }

//     @GetMapping("/")
//     public String home(Model model) {
//         Mountain mountain = new Mountain(1, "MountainA", "PrefectureA", true, 12.345f, 54.321f);
//         mountainRepository.save(mountain);
//         model.addAttribute("mountains", mountainRepository.findAll());
//         return "home";  // This refers to home.html template
//     }
// }
