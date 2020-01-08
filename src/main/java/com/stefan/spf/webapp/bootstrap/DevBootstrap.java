package com.stefan.spf.webapp.bootstrap;

import com.stefan.spf.webapp.model.Author;
import com.stefan.spf.webapp.model.Book;
import com.stefan.spf.webapp.repositories.AuthorRepository;
import com.stefan.spf.webapp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    //DI
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        Author author1 = new Author("Eric", "Evans");
        Book book1 = new Book("Domain Driven Design", "1234", "Harper Collins");
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("Rod", "Jhonson");
        Book book2 = new Book("J2EE Development without EJB", "23444", "Wrox");
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(book2);

    }
}
