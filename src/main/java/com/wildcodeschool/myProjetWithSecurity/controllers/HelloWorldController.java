package com.wildcodeschool.myProjetWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String admin() {
        return "La Loupe, Orléans, Bordeaux, Lyon, Toulouse, Lille, Strasbourg, Paris, Reims, Biarritz, Marseille, Tours, Lisbonne, Madrid, Berlin, Nantes, Bruxelles";
    }
}
