package com.example.petclinicproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/vets")
@Controller
public class VetController {

    @RequestMapping({"","/","/index","index.html"})
    public String listVet(){
        return "vets/index";
    }
}
