package com.example.caching.bookservice;

import com.example.caching.model.Book;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
//class BookServiceTest
//{
//    private Logger logger = LoggerFactory.getLogger(BookServiceTest.class);
//
//    @Autowired
//    private BookService bookService;
//
//    @Test
//    void addBook()
//    {
//        Book book = Book.builder()
//                .id(1)
//                .name("Boom boomer")
//                .author("prabhakar")
//                .category("Java")
//                .edition("2nd")
//                .publisher("india").build();
//
//        this.bookService.addBook(book);
//    }
//
//    @Test
//    void updateBook()
//    {
//        Book book = Book.builder()
//                .id(1)
//                .name("Looping")
//                .author("prabhakar")
//                .category("Java")
//                .edition("2nd")
//                .publisher("india").build();
//
//        this.bookService.updateBook(book);
//    }
//
//    @Test
//    void getBook()
//    {
//        Book book = this.bookService.getBook(1);
//
//        logger.info("getBook() : "+book);
//    }
//
//
//    @Test
//    void deleteBook()
//    {
//        this.bookService.deleteBook(1);
//    }
//
//
//
//
//}