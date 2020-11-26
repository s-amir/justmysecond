package com.darvish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class userLoginController {

    @RequestMapping("/userlogin")
    public String showUserLogin(){
        return "userLogin";
    }
}
