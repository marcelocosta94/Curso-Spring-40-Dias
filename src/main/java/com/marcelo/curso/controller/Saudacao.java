package com.marcelo.curso.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saudacao {

    @GetMapping("/saudacao")
    public String hello() {
        return "Seja bem-vindo ao curso de Spring Boot, Marcelo!";
    }
}