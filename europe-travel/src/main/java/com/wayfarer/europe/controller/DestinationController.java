package com.wayfarer.europe.controller;

import com.wayfarer.europe.data.DestinationRepository;
import com.wayfarer.europe.model.Destination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

import java.util.List;

@Controller
public class DestinationController {

    private final DestinationRepository repository;

    @Autowired
    public DestinationController(DestinationRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/destinations/{slug}")
    public String destination(@PathVariable String slug, Model model) {
        Destination destination = repository.findBySlug(slug)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No such destination: " + slug));

        List<Destination> more = repository.findByRegion(destination.getRegion()).stream()
            .filter(d -> !d.getSlug().equals(slug))
            .limit(3)
            .toList();

        model.addAttribute("d", destination);
        model.addAttribute("more", more);
        return "destination";
    }
}
