package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class LibraryController {
    private  static List<Author> authorList;
    private static List<Book> bookList;
}
