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

    @GetMapping("BOOKES/DATA")
    public List<Book> BOOKESDATA() {
        return Arrays.asList(
                new Book("RemoteSensing", "1"),
                new Book("GEOAI", "2"),
                new Book("ADVANCE GIS", "3"),
                new Book("INTRO TO GAVA", "4"),
                new Book("SPATIAL ANALYSIS", "5")
        );
    }

}