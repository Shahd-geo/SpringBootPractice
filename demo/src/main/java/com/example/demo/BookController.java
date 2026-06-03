package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    // Static in-memory bookshelf
    private static List<Book> bookshelf = new ArrayList<>();

}
