package com.example.caching.rest;

import com.example.caching.bookservice.BookService;
import com.example.caching.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class BookRest
{
    private Logger logger = LoggerFactory.getLogger(BookRest.class);

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    void addBook(@RequestBody Book book)
    {
        this.bookService.addBook(book);
        logger.info("added new book");
    }


    @PutMapping("/books")
    void updateBook(@RequestBody Book book)
    {
        this.bookService.updateBook(book);
        logger.info("book updated");
    }


    @GetMapping("books/{id}")
    Book getBook(@PathVariable("id") int id)
    {

        Book book = this.bookService.getBook(id);
        logger.info("getBook() : "+book);
        return book;

    }



    @DeleteMapping("/books/{id}")
     void deleteBook(@PathVariable("id") int id)
    {
        this.bookService.deleteBook(id);
        logger.info("deleted book id is : ");
    }
}
