package com.example.taskrecycler;

import java.util.ArrayList;

public class Book {
    ArrayList<Book> books=new ArrayList<>();

    public static final String BOOK_ID_EXTRA = "bookExtra";

    private int cover;
    private String author;
    private String title;
    private String description;
    private int id;

    public Book(int cover, String author, String title, String description) {
        this.cover = cover;
        this.author = author;
        this.title = title;
        this.description = description;
        this.id = books.size();
       books.add(this);
    }

    // Getters and setters

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {

        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


}
