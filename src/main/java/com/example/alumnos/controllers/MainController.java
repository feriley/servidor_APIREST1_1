package com.example.alumnos.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/test")
public class MainController {
    
    @GetMapping("/")
    public String test() {
        return "Hola mundo";
    }
    
}
