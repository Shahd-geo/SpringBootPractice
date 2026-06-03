package com.example.demo;

public class Book {
    private String BookName;
    private int id;

    public Book(String bookName, int id) {
        BookName = bookName;
        this.id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
