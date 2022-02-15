package com.example.caching.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book
{
    @Id
    private Integer id;
    private String name;
    private String category;
    private String author;
    private String publisher;
    private String edition;
}
