package com.example.demo;

public class Book {
    String BookName;
    String id ;

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Book(String bookName, String id) {
        BookName = bookName;
        this.id = id;
    }
}
