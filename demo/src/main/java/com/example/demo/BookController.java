package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    // Static in-memory bookshelf
    private static List<Book> bookshelf = new ArrayList<>();


    @GetMapping("/add-book")
    public String ADDBOOK(@RequestParam int id,String name){
        Book newbook=new Book(name, id);



    }

}
