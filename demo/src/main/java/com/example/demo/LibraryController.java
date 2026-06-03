package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class LibraryController {
    private  static List<Author> authorList;
    private static List<Book> bookList;

    @GetMapping("/addAuthor")
    public String ADDAUTHOR( @RequestParam int id,  @RequestParam String name, @RequestParam String biography) {
        Author newAuthor = new Author(id, name, biography);
        authorList.add(newAuthor);
        return "Author added successfully! ID: " + id + ", Name: " + name + "biography : "+ biography;
    }
    @GetMapping("/allAuthors")
    public List<Author> getAllAuthors() {
        return authorList;
    }
}

