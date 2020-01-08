package com.stefan.spf.webapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {

    private String title;
    private String isbn;
    private String publisher;

    private Set<Author> authors = new HashSet<>();

    public Book(String title, String isbn, String publisher){
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }

}
