package com.anton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

@Controller
public class WelcomeController {

    @RequestMapping(
            value = "/welcome",
            method = RequestMethod.GET
    )
    public void welcome(ModelAndView modelAndView) {
        modelAndView.setViewName("welcome");
        modelAndView.addObject("message", "Welcome to Anton");

//        return "welcome";
    }
}
