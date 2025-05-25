package com.example.practicespringboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PracticeController {
    @RequestMapping("/parameter")
    // RequestParam url -> http://localhost:8080/parameter?color=...
    public String param(@RequestParam(required = false) String name,
                       @RequestParam(required = false) String color,
                       Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "dynamicHome.html";
    }

    @RequestMapping("/path/{color}")
    // Path variable url -> http://localhost:8080/path/...
    public String path(@PathVariable String color, Model page) {
        page.addAttribute("username", "Alex");
        page.addAttribute("color", color);
        return "dynamicHome.html";
    }
}
