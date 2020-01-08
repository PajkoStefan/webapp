package com.stefan.spf.webapp.repositories;

import com.stefan.spf.webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
