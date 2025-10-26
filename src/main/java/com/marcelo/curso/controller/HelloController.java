package com.marcelo.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Olá, Spring Boot! 🚀 Seu primeiro endpoint está funcionando!";
    }
}