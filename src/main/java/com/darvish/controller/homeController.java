package com.darvish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class homeController {
    @RequestMapping("/")
    public String showPage(){
        return "index";
    }
}
