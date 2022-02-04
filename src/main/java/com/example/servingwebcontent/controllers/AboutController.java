package com.example.servingwebcontent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//контроллер на страницу about
@Controller
public class AboutController {

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("title", "Страница about");
        return "about";
    }

}
