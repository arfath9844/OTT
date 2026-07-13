package com.training.ott.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/api/movies")
    public String getMovies() {
        return "Movies API is working";
    }
}
