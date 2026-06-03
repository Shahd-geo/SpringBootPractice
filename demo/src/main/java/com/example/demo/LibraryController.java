package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class LibraryController {
    private  static List<Author> authorList = new ArrayList<>();
    private static List<Book> bookList =new ArrayList<>();

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
    @GetMapping("/addRelationalBook")
    public String addRelationalBook(@RequestParam int id,  @RequestParam String name, @RequestParam int authorId) {
        boolean authorExsit= false;
        for (Author a : authorList) {
            if (a.getId() == authorId) {
                authorExsit = true;
                break;
            }
        }

        if (authorExsit) {
            // Create and save the book only if the author exists
            Book newBook = new Book(name, id, authorId);
            bookList.add(newBook);
            return "Book added successfully! Name: " + name +
                    ", id: " + id +
                    ", Author ID: " + authorId;
        } else {
            // Reject the book if the author doesn’t exist
            return "Error: Author with ID " + authorId + " does not exist. Book not saved.";
        }
    }


}

