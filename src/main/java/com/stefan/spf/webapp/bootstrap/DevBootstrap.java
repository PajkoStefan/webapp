package com.stefan.spf.webapp.bootstrap;

import com.stefan.spf.webapp.model.Author;
import com.stefan.spf.webapp.model.Book;
import com.stefan.spf.webapp.model.Publisher;
import com.stefan.spf.webapp.repositories.AuthorRepository;
import com.stefan.spf.webapp.repositories.BookRepository;
import com.stefan.spf.webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    //DI
    public DevBootstrap(AuthorRepository authorRepository,
                        BookRepository bookRepository,
                        PublisherRepository publisherRepository)
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher publisher1 = new Publisher();
        publisher1.setName("publisher1");
        publisher1.setAddress("publisher1_address");
        publisherRepository.save(publisher1);

        Author author1 = new Author("Eric", "Evans");
        Book book1 = new Book("Domain Driven Design", "1234", publisher1);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Publisher publisher2 = new Publisher();
        publisher2.setName("publisher2");
        publisher2.setAddress("publisher2_address");
        publisherRepository.save(publisher2);

        Author author2 = new Author("Rod", "Jhonson");
        Book book2 = new Book("J2EE Development without EJB", "23444", publisher2);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        authorRepository.save(author2);
        bookRepository.save(book2);

    }
}
