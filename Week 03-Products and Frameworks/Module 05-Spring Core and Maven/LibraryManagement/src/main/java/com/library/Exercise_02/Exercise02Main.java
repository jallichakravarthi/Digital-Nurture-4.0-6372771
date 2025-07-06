package com.library.Exercise_02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookServiceEx2;

public class Exercise02Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-ex2.xml");

        BookServiceEx2 bookService = context.getBean("bookService2", BookServiceEx2.class);

        // Display current books
        bookService.displayBooks();

        // Add a new book
        bookService.addBook("Clean Code");

        // Display updated list
        bookService.displayBooks();
    }
}
