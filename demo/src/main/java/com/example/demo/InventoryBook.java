package com.example.demo;

public class InventoryBook {
    private int bookID;
    private String title;
    private double price;
    private int stockCount;

    public InventoryBook(int bookID, String title, double price, int stockCount) {
        this.bookID = bookID;
        this.title = title;
        this.price = price;
        this.stockCount = stockCount;
    }
}
