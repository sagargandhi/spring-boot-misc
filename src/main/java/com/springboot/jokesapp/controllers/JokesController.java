package com.springboot.jokesapp.controllers;

import com.springboot.jokesapp.services.JokeGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller

public class JokesController {
    private JokeGenerator jokeGenerator;

    @Autowired
    public JokesController(JokeGenerator jokeGenerator){
        this.jokeGenerator = jokeGenerator;
    }

    @RequestMapping({"/", ""})
    public String joke(Model model){
        model.addAttribute("joke", jokeGenerator.getJoke());
        return "chuckNorris";
    }

}
