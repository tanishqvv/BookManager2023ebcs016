package com.example.bookmanager.controller;
/*TANISHQ VIJAY VAIDYA2023EBCS016*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String gethome() {
        return "index"; 
    }
}
