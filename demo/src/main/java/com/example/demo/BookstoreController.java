package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookstoreController {
    private static List<InventoryBook> bookstore=new ArrayList<>();




    @GetMapping("/addIteam")
    public static List<InventoryBook> bookstore(@RequestParam int id,@RequestParam String titel , @RequestParam int price , int stockCount ){

    }


}
