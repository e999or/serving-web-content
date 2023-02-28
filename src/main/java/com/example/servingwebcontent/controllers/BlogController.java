package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.models.Post;
import com.example.servingwebcontent.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//контроллер на страницу blog
@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

        @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }

    @GetMapping("/blog/add")
    public String blogAdd(Model model){
         return "blog-add";
    }
}
