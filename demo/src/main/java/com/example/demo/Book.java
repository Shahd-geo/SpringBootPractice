package com.example.demo;

public class Book {
    private String BookName;
    private int id;
    private int authorId;

    public Book(String bookName, int id, int authorId) {
        BookName = bookName;
        this.id = id;
        this.authorId = authorId;
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

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}


