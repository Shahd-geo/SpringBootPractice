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


    @GetMapping("/addBook")
    public String ADDBOOK(@RequestParam String name, int id,int authorId) {
        Book newbook = new Book(name, id,authorId);

        // Add the book to the bookshelf
        bookshelf.add(newbook);

        // Return confirmation message
        return "Book added successfully! ";
    }

    @GetMapping("/allBooks")
    public List<Book> ALLBOOKS() {
        return bookshelf;

    }

    @GetMapping("/findById")
    public Book searchid(@RequestParam int id) {
        for (Book B : bookshelf) {
            if (B.getId() == id) {
                return B;
            }
        }
        return null;
    }

    @GetMapping("/findByName")
    public Book searchByName(@RequestParam String name) {
        for (Book B : bookshelf) {
            if (B.getBookName().equalsIgnoreCase(name)) {
                return B;
            }
        }
        return null;

    }

    @GetMapping("/searchMsg")
    public String searchMassag(@RequestParam int id) {
        for (Book b : bookshelf) {
            if (b.getId() == id) {
                // If found, return a friendly message
                return "Found: " + b.getBookName();
            }
        }
        // If not found, return a fallback message
        return "Sorry, that book ID is not available.";
    }

    // extra practice of handling with not found book name
    //search by name and return massage that include book id
    @GetMapping ("/searchByNameMsg")
    public String searchBookByNameWithMessage(@RequestParam String name) {
      for (Book B : bookshelf){
          if (B.getBookName().equalsIgnoreCase(name)){
              return "Found: ID = " + B.getId() ;
          }
      }
        return "Sorry, no book with the name \"" + name + "\" was found.";
    }
}




