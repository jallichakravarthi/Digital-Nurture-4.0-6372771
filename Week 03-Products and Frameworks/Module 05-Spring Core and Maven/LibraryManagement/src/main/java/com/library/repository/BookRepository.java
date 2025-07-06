package com.library.repository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<String> books = new ArrayList<>();

    public BookRepository() {
        // Preload some books
        books.add("Spring in Action");
        books.add("Effective Java");
    }

    public List<String> getAllBooks() {
        return books;
    }

    public void addBook(String bookName) {
        books.add(bookName);
    }
}
