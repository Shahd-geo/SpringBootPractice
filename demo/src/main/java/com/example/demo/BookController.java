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
    public String ADDBOOK(@RequestParam String name,int id){
        Book newbook=new Book(name, id);

        // Add the book to the bookshelf
        bookshelf.add(newbook);

        // Return confirmation message
        return "Book added successfully! ";
    }
    @GetMapping ("/all-books")
    public List<Book> ALLBOOKS( ){
        return bookshelf;

    }

    @GetMapping ("/find-by-id")
    public Book searchid(@RequestParam int id ){
        for (Book B : bookshelf){
            if (B.getId()==id){
                return B;
            }
        }
        return null;
    }

    @GetMapping("/find-by-name")
    public Book searchByName (@RequestParam String name){
        for (Book B : bookshelf){
            if (B.getBookName().equalsIgnoreCase(name)){
                return B;
            }
        }
        return null;

    }



}
