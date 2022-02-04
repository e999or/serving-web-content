package com.example.servingwebcontent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//контроллер на страницу home
@Controller
public class GreetingController {

    @GetMapping("/")//указать название, в данном случае href="/">Главная</a>
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");//можно прописать любой атрибут
        return "home";
    }

}
