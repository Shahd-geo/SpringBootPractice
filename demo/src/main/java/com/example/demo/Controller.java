package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController


public class Controller {
    @GetMapping
    public String greeting() {
        return "HI SHAHD";
    }
    @GetMapping("GREET")
    public String GREETING ( @RequestParam String INPUT){
        return " hi "+ INPUT;
    }


}