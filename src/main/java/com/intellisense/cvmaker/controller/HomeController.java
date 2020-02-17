package com.intellisense.cvmaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomeController {

    public String viewHomePage(){
        return "index";
    }
}
