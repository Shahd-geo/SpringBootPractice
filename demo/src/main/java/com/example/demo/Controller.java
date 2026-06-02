package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController


public class Controller {
    @GetMapping
    public String greeting (){
        return "HI SHAHD";
    }
    @GetMapping("bookes/names")
    public List<String>BOOKES(){
        return Arrays.asList(
                "Motivation",
                "RemoteSensing",
                "GEOAI",
                "ADVANCE GIS"
                );
    }
}