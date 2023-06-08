package com.betaplan.anderson.springprojects.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(@RequestParam(value = "name", required = false) String name,
                       @RequestParam(value = "last_name", required = false) String last_name){
        if(name != null && last_name != null){
            return "Hello "+name + " "+last_name;
        } else if (name != null) {
            return "Hello " + name;
        } else if (last_name != null) {
            return "Hello " + last_name;
        }else {
            return "Hello human";
        }
    }
}
