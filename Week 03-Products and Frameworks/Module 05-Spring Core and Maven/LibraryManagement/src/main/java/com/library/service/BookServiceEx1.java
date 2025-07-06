package com.library.service;

import java.util.List;

import com.library.repository.BookRepository;

public class BookServiceEx1 {
    private BookRepository bookRepository = new BookRepository();

    public void displayBooks() {
        List<String> books = bookRepository.getAllBooks();
        System.out.println("Books in the library:");
        for (String book : books) {
            System.out.println("- " + book);
        }
    }

    public void addBook(String bookName) {
        bookRepository.addBook(bookName);
        System.out.println("Book added: " + bookName);
    }
}
