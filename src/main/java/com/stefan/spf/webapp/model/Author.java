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
public class Author {

    private String firstName;
    private String lastName;

    private Set<Book> books = new HashSet<>();

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
