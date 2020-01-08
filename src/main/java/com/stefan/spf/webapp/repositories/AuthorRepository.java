package com.stefan.spf.webapp.repositories;

import com.stefan.spf.webapp.model.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author, Long> {
}
