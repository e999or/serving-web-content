package com.example.servingwebcontent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//контроллер на страницу blog
@Controller
public class BlogController {

    @GetMapping("/blog")
    public String blogMain(Model model){
        return "blog-main";
    }
}
