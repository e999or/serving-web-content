package com.example.servingwebcontent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String home(Model model){
        model.addAttribute("title", "Страница hello");
        return "hello";
    }
}
