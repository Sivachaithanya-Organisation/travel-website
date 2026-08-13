package com.wayfarer.europe.controller;

import com.wayfarer.europe.data.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private final DestinationRepository repository;

    @Autowired
    public HomeController(DestinationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index(@RequestParam(required = false, defaultValue = "all") String region, Model model) {
        model.addAttribute("destinations", repository.findByRegion(region));
        model.addAttribute("regions", repository.regions());
        model.addAttribute("activeRegion", region);
        model.addAttribute("total", repository.findAll().size());
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}
