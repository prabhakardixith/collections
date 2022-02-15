package com.example.caching.bookservice;

import com.example.caching.model.Book;
import com.example.caching.model.bookRepo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BookService
{

    @Autowired
    private BookRepo bookRepo;

    public void addBook(Book book)
    {
        this.bookRepo.save(book);
    }

    @CachePut(cacheNames="books",key="#book.id")
    public void updateBook(Book book)
    {
        this.bookRepo.updateBook(book.getAuthor(),book.getId());
    }

    @Cacheable(cacheNames="books",key="#id")
    public Book getBook(Integer id)
    {
        return this.bookRepo.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
    }

    @CacheEvict(cacheNames="books",key = "#id")
    public void deleteBook(Integer id)
    {
        this.bookRepo.deleteById(id);
    }





}
