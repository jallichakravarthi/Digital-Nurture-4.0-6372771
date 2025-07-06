package com.library.service;

import java.util.List;

import com.library.repository.BookRepository;

public class BookServiceEx2 {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

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
