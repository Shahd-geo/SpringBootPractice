package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookstoreController {
    private static List<InventoryBook> bookstore = new ArrayList<>();


    @GetMapping("/addInventoryBook")
    public String  addInventoryBook(@RequestParam int id, @RequestParam String title, @RequestParam double price, int stockCount) {
        InventoryBook newBook = new InventoryBook(id, title, price, stockCount);
        bookstore.add(newBook);
        return "Book added successfully! ID: " + id +
                " Title: " + title +
                ", Price: " + price +
                ", Stock Count: " + stockCount;
    }



}
