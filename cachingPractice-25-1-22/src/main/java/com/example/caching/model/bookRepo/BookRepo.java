package com.example.caching.model.bookRepo;

import com.example.caching.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;

public interface BookRepo extends JpaRepository<Book,Integer>
{

    @Transactional
    @Modifying
    @Query(nativeQuery = true,value = "update book b set b.author =?1 where b.id=?2")
    void updateBook(String  author,int id);
}
