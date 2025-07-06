package com.library.Exercise_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookServiceEx1;

public class Exercise01Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-ex1.xml");

        BookServiceEx1 bookService = context.getBean("bookService1", BookServiceEx1.class);

        // Display current books
        bookService.displayBooks();

        // Add a new book
        bookService.addBook("Clean Code");

        // Display updated list
        bookService.displayBooks();
    }
}
